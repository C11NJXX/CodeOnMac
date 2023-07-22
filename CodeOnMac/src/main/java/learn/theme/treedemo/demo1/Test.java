package main.java.learn.theme.treedemo.demo1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //创建二叉树
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        //建立联系
        treeNode1.setLeft(treeNode2);
        treeNode1.setRight(treeNode3);
        treeNode2.setLeft(treeNode4);
        treeNode3.setRight(treeNode5);
        //创建集合存储节点
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(treeNode1);
        list.add(treeNode2);
        list.add(treeNode3);
        list.add(treeNode4);
        list.add(treeNode5);
        for (TreeNode treeNode : list) {
            TreeNode.showInfo1(treeNode);
        }
        //TreeNode.showInfo2(treeNode1);

        //exert(treeNode1, treeNode2, list);
    }

    private static void exert(TreeNode treeNode1, TreeNode treeNode2, ArrayList<TreeNode> list) {
        //测试插入节点
        //二节点的左节点插入6节点
        TreeNode treeNode6 = new TreeNode(6);
        list.add(treeNode6);
        treeNode1.setLeft(treeNode6);
        treeNode6.setLeft(treeNode2);

        System.out.println("插入6节点后" + "\n" + "-------------------");
        TreeNode.showInfo2(treeNode1);
    }
}
