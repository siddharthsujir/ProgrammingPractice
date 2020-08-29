package com.company;

//      1     0
///   2   3   1
//  4  5 6  7 2

//    1 2 3 4 5 6 7
//1   0 1 1 2 2 2 2
//2   1
//3   1
//4   2
//5   2
//6   2
//7   2

class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }

    TreeNode(int data, TreeNode leftNode,TreeNode rightNode)
    {
        this.left=leftNode;
        this.right=rightNode;
        this.data=data;
    }
}

public class BinaryTree_Pblm {



        public static void inOrderTraversal_Recursion(TreeNode root)
        {
            if(root==null)
                return;
            inOrderTraversal_Recursion(root.left);
            System.out.println(root.data);
            inOrderTraversal_Recursion(root.right);
        }

    public static void preOrder(TreeNode root)
    {
        if(root==null)
            return;
        if(root!=null)
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
    }

    public static void inOrder(Node root) {

            if(root==null)
                return;
            else
                inOrder(root.left);
                System.out.println(root.data);
                inOrder(root.right);
    }



}
