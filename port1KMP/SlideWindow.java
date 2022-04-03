package port1KMP;


/**
 * 滑动窗口
 *
 *
 */
public class SlideWindow {
    public static void main(String[] args) {
        morrisTraverse(null);
    }


    /**
     * 介绍一种时间复杂度O(N),额外空间复杂度为O(1)的二叉树的遍历方式。
     */
    public static void morrisTraverse(TreeNode node) {

    }

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        public TreeNode(int value) {
            this.value = value;
        }
    }

}