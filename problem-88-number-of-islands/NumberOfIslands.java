public class NumberOfIslands {

    public static void main(String[] args) {

        char[][] grid1 = {
                { '1', '1', '0', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '1', '0', '0' },
                { '0', '0', '0', '1', '1' }
        };
        System.out.println(numIslands(grid1));

        char[][] grid2 = {
                { '1', '1', '1' },
                { '0', '1', '0' },
                { '1', '1', '1' }
        };
        System.out.println(numIslands(grid2));

        char[][] grid3 = { { '1' } };
        System.out.println(numIslands(grid3));

        char[][] grid4 = { { '0' } };
        System.out.println(numIslands(grid4));

        char[][] grid5 = { { '1', '0', '1' } };
        System.out.println(numIslands(grid5));

        char[][] grid6 = { { '1' }, { '0' }, { '1' } };
        System.out.println(numIslands(grid6));

        char[][] grid7 = { { '1', '1', '0', '1', '1' } };
        System.out.println(numIslands(grid7));

        char[][] grid8 = {
                { '1', '0', '1', '0', '1' },
                { '0', '1', '0', '1', '0' },
                { '1', '0', '1', '0', '1' }
        };
        System.out.println(numIslands(grid8));
    }

    // returns total number of islands in the grid
    private static int numIslands(char[][] grid) {

        int count = 0;

        // traverse each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                // if land is found, explore entire island
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++; // one complete island found
                }
            }
        }

        return count;
    }

    // DFS to mark all connected land cells
    private static void dfs(char[][] grid, int i, int j) {

        // stop if out of bounds or water
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length
                || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0'; // mark current land as visited

        // explore all four directions
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}

/*
 * We scan the grid cell by cell. Whenever we encounter a land cell ('1'),
 * it means we have found a new island. Using DFS, we visit all connected
 * land cells and mark them as water so they are not counted again.
 *
 * Each DFS call clears one entire island. The total number of DFS calls
 * gives us the number of islands. The solution runs in O(rows * cols) time.
 */
