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

import java.util.*;

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


    boolean checkBST(Node root) {
            if(root==null)
            {
                System.out.println("Here1");
                return true;
            }


        if(root.left==null && root.right==null)
        {
            System.out.println("Here2");
            return true;
        }


        if(root.left==null)
        {
            if(root.right.data<root.data)
            {
                System.out.println("Here3");
                return false;
            }

        }

        if(root.right==null)
        {
            if(root.left.data>=root.data)
            {
                System.out.println("Here4");
                return false;
            }

        }

        if((root.left.data>=root.data) || (root.right.data<root.data))
        {
            System.out.println("Here5");
            return false;
        }


         if(!checkBST(root.left) || !checkBST(root.right))
         {
             System.out.println("Here6");
             return false;
         }

         else
         {
             System.out.println("Here7");
             return true;
         }


    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>>  output=new LinkedList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        int i=0;
        int j=0;
        q.add(root);
        output.add(i,new ArrayList<Integer>());
        while(!q.isEmpty())
        {
            TreeNode current=q.poll();
            if(current.left!=null)
                    q.add(current.left);

            if(current.right!=null)
                q.add(current.right);

            if(i==0)
            {
                output.get(i).add(j,current.data);
               j=0;
               i++;
                output.add(i,new ArrayList<Integer>());
            }
            else
            {

                output.get(i).add(j,current.data);
                j++;
                if(j==2)
                {
                    j=0;
                    i++;
                    output.add(i,new ArrayList<Integer>());
                }
            }

        }
        if(output.get(i).isEmpty())
            output.remove(i);
        return output;
    }

    public int maxDepth(TreeNode root) {

            if(root==null)
                return 0;
            else
            {
                int left_depth= maxDepth(root.left)+1;
                int right_depth=maxDepth(root.right)+1;
               return left_depth>right_depth? left_depth: right_depth;
            }


    }

}
