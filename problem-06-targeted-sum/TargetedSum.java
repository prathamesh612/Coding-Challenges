public class TargetedSum {

    public static void main(String[] args) {
        findTarget(new int[] { 2, 7, 11, 15 }, 9);
        findTarget(new int[] { 3, 2, 4, 5 }, 6);
        findTarget(new int[] { 1, 3, 5, 6, 7, 8 }, 15);
        findTarget(new int[] { 5, 75, 25 }, 100);
        findTarget(new int[] { 0, 4, 3, 0 }, 0);
        findTarget(new int[] { -3, 4, 3, 90 }, 0);
        findTarget(new int[] { 1, 2, 3, 4, 4 }, 8);
        findTarget(new int[] { 10, 20, 10, 40, 50, 60, 70 }, 50);
        findTarget(new int[] { 100, 200, 300, 400, 500 }, 900);
        findTarget(new int[] { 1, 3, 5, 7 }, 14);
    }

    private static void findTarget(int[] arr, int target) {

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}
