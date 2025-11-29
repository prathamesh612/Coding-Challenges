import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreePaths {

    public static void main(String[] args) {
        // Test case 1: [1,2,3,null,5]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root1));

        // Test case 2: [1]
        TreeNode root2 = new TreeNode(1);
        System.out.println(binaryTreePaths(root2));

        // Test case 3: [1,2,3,4,5]
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        System.out.println(binaryTreePaths(root3));
    }

    // Returns all root-to-leaf paths
    private static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;

        collectPaths(root, "", paths);
        return paths;
    }

    private static void collectPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) return;

        // Add current node value to the running path
        if (path.isEmpty()) {
            path = path + node.val;
        } else {
            path = path + "->" + node.val;
        }

        // If leaf: add full path to result
        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        // Otherwise recurse left & right
        collectPaths(node.left, path, paths);
        collectPaths(node.right, path, paths);
    }
}
