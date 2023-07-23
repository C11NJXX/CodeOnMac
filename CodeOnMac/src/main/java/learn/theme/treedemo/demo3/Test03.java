package main.java.learn.theme.treedemo.demo3;

import com.sun.source.tree.Tree;
import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.List;

//插入节点
public class Test03 {
        static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode root = BinarySearchTree.getBuiltTree();
        TreeNode insertNode = insertNode(root, 16);
        list = inorderTraversal(root);
        for(int i : list) {
            System.out.print(i + " ");
        }
    }

    public static TreeNode insertNode(TreeNode root, int num) {
        TreeNode preNode = null;
        if (root != null) {
            while (root != null) {
                if(root.getValue() == num) {
                    System.out.println("Node already exits!");
                    return root;
                }
                if(root.getValue() < num) {
                    preNode = root;
                    root = root.getRight();
                }else if(root.getValue() > num ) {
                    preNode = root;
                    root = root.getLeft();
                }
            }
            if(preNode.getValue() < num) {
                preNode.setRight(new TreeNode(num));
                return preNode.getRight();
            }else if(preNode.getValue() > num ) {
                preNode.setLeft(new TreeNode(num));
                return preNode.getLeft();
            }
        }else {
            return null;
        }
        return null;
    }
    public static List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return null;
        } else {
            inorderTraversal(root.getLeft());
            list.add(root.getValue());
            inorderTraversal(root.getRight());
        }
        return list;
    }

}
