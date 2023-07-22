package main.java.learn.theme.treedemo.demo2;
import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test01 {
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
        //------//
        List<Integer> result = method1(treeNode1);
        for(int i : result) {
            System.out.println(i + " ");
        }

    }

    private static List<Integer> method1(TreeNode root) {
        //层序遍历法，遍历的同时获取节点值
        //用queue存储每个节点(FIFO)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        //创建一个List存储每个节点值
        List<Integer> list = new ArrayList<>();
        //循环判断是否为空
        while(!queue.isEmpty()) {
            //非空，队首出列（第一次就是根节点）
            TreeNode node = queue.poll();
            list.add(node.getValue());
            //分别判断左右节点(利用queue FIFO的特性，保证遍历顺序)
            if(node.getLeft() != null ) {
                queue.add(node.getLeft());
            }
            if(node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        //在每一次遍历的时候都会记录当前传入节点的值，并且如果有左右节点，都会按照顺序入队，循环结束证明所有的节点都已经遍历完毕了
        return list;
    }
}
