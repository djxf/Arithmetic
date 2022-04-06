package 算法学习代码;


import port1KMP.SlideWindow;

/**
 * 题目1：
 *      二叉树中，一个节点可以往上走和往下走，那么从节点A总能走到节点B。
 * 节点A走到节点B的距离为：A走到B最短路径上的节点个数。
 *      求一个二叉树上的最远距离。
 *
 *
 * 题目2：
 *      一个公司的上下级关系是一颗多叉树，这个公司要举办晚会。你作为组织者已经摸清了大家的心理。一个员工直接上级到场。
 *      这个员工肯定不会来。每个员工都有一个活跃度的值。决定谁来你会给这个员工发邀请函。这么让舞会的气氛最活跃。
 *      返回最大的活跃值。
 *
 *
 * 题目3：
 *      判断一棵树是否是平衡二叉树。
 *
 *
 * 题目4：LRU缓存结构
 *
 *
 * 题目5：LFU缓存结构
 *
 *
 * 分析可能性
 */
public class Code0405 {
    public static void main(String[] args) {

    }

    public int maxInstanceOnNodes(BinaryTreeNode root) {
        return 0;
    }


    static class BinaryTreeNode {
        BinaryTreeNode left;
        BinaryTreeNode right;
        int value;
        public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }

    static class ReturnType {
        int maxInstance;
        int maxInstanceSelf;
    }



    public boolean isBalanceBinaryTree(BinaryTreeNode binaryTreeNode) {
        return false;
    }
}
