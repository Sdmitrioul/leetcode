package random;

public class FindTheLengthOfTheLongestCommonPrefix {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        TreeNode root = TreeNode.buildTree(arr1);
        int maxPrefix = 0;
        for (int value : arr2) {
            TreeNode node = root;
            int delimiter = getMaxPowTen(value);
            int prefix = 0;
            while (delimiter > 0 && node != null) {
                int digit = value / delimiter;
                value = value % delimiter;
                delimiter /= 10;
                node = node.children[digit];
                if (node != null) {
                    prefix++;
                }
            }
            maxPrefix = Math.max(maxPrefix, prefix);
        }
        return maxPrefix;
    }

    public static int getMaxPowTen(int value) {
        int result = 1;
        while (value / result >= 10) {
            result *= 10;
        }
        return result;
    }

    private static class TreeNode {
       TreeNode[] children = new TreeNode[10];

       static TreeNode buildTree(int[] arr) {
           TreeNode root = new TreeNode();
           for (int value : arr) {
               TreeNode node = root;
               int delimiter = getMaxPowTen(value);
               while (delimiter > 0) {
                   int digit = value / delimiter;
                   value = value % delimiter;
                   delimiter /= 10;
                   if (node.children[digit] == null) {
                       node.children[digit] = new TreeNode();
                   }
                   node = node.children[digit];
               }
           }
           return root;
       }
    }
}