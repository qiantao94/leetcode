package category;

public class Tree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 合并二叉树，同一节点值相加
     * 617. Merge Two Binary Trees
     */
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    /**
     * 树的深度
     * 104. Maximum Depth of Binary Tree
     */
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        System.out.println("left: " + left);
        int right = maxDepth(root.right);
        System.out.println("right: " + right);
        return left > right ? left + 1 : right + 1;
    }

    /**
     * 反转二叉树
     * 226. Invert Binary Tree
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }

    /**
     * 二叉树转换
     * 538. Convert BST to Greater Tree
     */
    public static TreeNode convertBST(TreeNode root){
        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while(!stack.isEmpty() || node != null){
            while(node != null){
                stack.add(node);
                node = node.right;
            }
            node = stack.pop();
            sum += node.val;
            node.val = sum;

            node = node.left;
        }

        return root;
    }
}
