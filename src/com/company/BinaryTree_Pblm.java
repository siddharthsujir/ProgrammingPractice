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

import sun.awt.image.ImageWatched;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

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

    public static void levelOrder(Node root) {

        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            Node temp=queue.poll();
            System.out.println(temp.data);

            if(temp.left!=null)
            {
                queue.add(temp.left);
            }
            if(temp.right!=null)
            {
                queue.add(temp.right);
            }

        }

    }

    public static void topView(Node root) {

            if(root==null)
                return;
            else
            {
                System.out.print(root.data+" ");
                topView(root.right);
            }

    }


    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if(root==null)
            return null;

        if(root.data==v1 || root.data==v2)
            return root;

        Node root_left_LCA=lca(root.left,v1,v2);
        Node root_right_LCA=lca(root.right,v1,v2);

        if(root_left_LCA!=null && root_right_LCA!=null)
            return root;

        return root_left_LCA!=null?root_left_LCA:root_right_LCA;


    }




}
