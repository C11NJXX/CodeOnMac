package main.java.learn.theme.treedemo.demo3;

import main.java.learn.theme.treedemo.demo1.TreeNode;

import java.util.ArrayList;
import java.util.List;

//  删除节点
public class Test04 {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = BinarySearchTree.getBuiltTree();

        //printTree(root);

        method1(root);
        method2(root);
        method3(root);
    }

    private static void method3(TreeNode root) {
        //测试是否能正常删除度数为2的节点
        deleteNode(root, 4);
        System.out.println("delete 4");
        printTree(root);
    }

    private static void method2(TreeNode root) {
        //测试是否能正常删除度数为1的节点
        deleteNode(root, 2);
        System.out.println("delete 2");
        printTree(root);
    }

    private static void method1(TreeNode root) {
        //测试是否能正常删除叶节点
        deleteNode(root, 1);
        System.out.println("delete 1");
        printTree(root);
    }

    private static void deleteNode(TreeNode root, int val) {
        TreeNode preNode = root;
        while (true) {
            if (root != null) {
                if (root.getValue() == val) {
                    //当前节点为所删除节点
                    if (isLeaf(root)) {
                        //如果是叶节点
                        //根据左右节点,直接删除
                        if (preNode.getValue() > val) {
                            preNode.setLeft(null);
                        } else if (preNode.getValue() < val) {
                            preNode.setRight(null);
                        }
                        return;
                    } else if (isOneLeaf(root)) {
                        //节点度数为1
                        //根据左右节点，覆盖
                        if (preNode.getValue() > val) {
                            //root在pre的左节点位置
                            //判断左右哪个为null
                            if (root.getLeft() == null) {
                                //使用右节点
                                preNode.setLeft(root.getRight());
                            } else if (root.getRight() == null) {
                                //使用左节点
                                preNode.setLeft(root.getLeft());
                            }
                            return;
                        } else if (preNode.getValue() < val) {
                            //root在pre的右节点
                            if (root.getLeft() == null) {
                                //使用右节点
                                preNode.setRight(root.getRight());
                            } else if (root.getRight() == null) {
                                //使用左节点
                                preNode.setRight(root.getLeft());
                            }
                            return;
                        }
                    } else if (isTwoLeaf(root)) {
                        //2度节点，采取右子树左节点替换法
                        //获取右子树左节点
                        TreeNode nex = root.getRight().getLeft();
                        //递归删除右子树左节点（不知道是叶还是1度还是2度）
                        deleteNode(root, nex.getValue());
                        //将nex节点替换到root节点
                        root.setValue(nex.getValue());
                        return;
                    }

                } else if (root.getValue() < val) {
                    //所要查找的节点在右边
                    preNode = root;
                    root = root.getRight();
                } else {
                    //所要查找的节点在左边
                    preNode = root;
                    root = root.getLeft();
                }
            } else {
                return;
            }
        }
    }

    private static boolean isLeaf(TreeNode root) {
        if (root.getLeft() == null && root.getRight() == null) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isOneLeaf(TreeNode root) {
        if (!isLeaf(root) && !isTwoLeaf(root)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isTwoLeaf(TreeNode root) {
        if (root.getLeft() != null && root.getRight() != null) {
            return true;
        } else {
            return false;
        }
    }

    private static void printTree(TreeNode root) {
        if (list.isEmpty()) {
            emptyPrintTree(root);
        } else {
            list.clear();
            emptyPrintTree(root);
        }

    }

    private static void emptyPrintTree(TreeNode root) {
        list = inorderTraversal(root);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
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



