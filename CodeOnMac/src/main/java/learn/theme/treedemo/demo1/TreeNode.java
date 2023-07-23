package main.java.learn.theme.treedemo.demo1;

import com.sun.source.tree.Tree;

//创建节点类
public class TreeNode implements Comparable {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
        this.value = 0;
        left = null;
        right = null;
    }

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public static void showInfo1(TreeNode treeNode) {
        if (treeNode.left != null && treeNode.right != null) {
            System.out.println(treeNode.value + "节点的左节点为：" + treeNode.left.value + " 该节点的右节点为：" + treeNode.right.value);
        } else if (treeNode.left != null && treeNode.right == null) {
            System.out.println(treeNode.value + "节点的左节点为：" + treeNode.left.value + " 该节点的右节点为空 ");
        } else if (treeNode.left == null && treeNode.right != null) {
            System.out.println(treeNode.value + "节点的左节点为空" + " 该节点的右节点为:" + treeNode.right.value);
        } else {
            System.out.println(treeNode.value + "节点为叶节点");
        }
    }
    public static void showInfo2(TreeNode treeNode){
        if(treeNode != null) {
            //根节点不为空，先打印根节点情况,判断左右节点，按照先左后右顺序打印
            TreeNode.showInfo1(treeNode);
           //利用循环，当碰到叶节点时，停止该分支
           if(treeNode.left != null) {
               //左节点不为空，作为新的根节点
               Thread leftThread = new Thread(
                       new Runnable() {
                           @Override
                           public void run() {
                               TreeNode.showInfo2(treeNode.left);
                           }
                       }
               );
               leftThread.start();
           }
            if(treeNode.right != null) {
                //左节点不为空，作为新的根节点
                Thread rightThread = new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                TreeNode.showInfo2(treeNode.right);
                            }
                        }
                );
                rightThread.start();
            }
        }else {

        }
    }
        public static boolean isLeaf(TreeNode treeNode) {
            if(treeNode.left == null && treeNode.right == null) {
                return true;
            }else {
                return false;
            }
        }
    @Override
    public int compareTo(Object o) {
        TreeNode treeNode = (TreeNode) o;
        if (this.value > treeNode.value) {
            return 1;
        } else if (this.value < treeNode.value) {
            return -1;
        } else {
            return 0;
        }
    }
}

