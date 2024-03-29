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


import java.util.*;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data)
    {

        this.val=data;
        this.left=null;
        this.right=null;
    }

    TreeNode(int data, TreeNode leftNode,TreeNode rightNode)
    {
        this.left=leftNode;
        this.right=rightNode;
        this.val=data;
    }
}

public class BinaryTree_Pblm {



        public static void inOrderTraversal_Recursion(TreeNode root)
        {
            if(root==null)
                return;
            inOrderTraversal_Recursion(root.left);
            System.out.println(root.val);
            inOrderTraversal_Recursion(root.right);
        }

    public static void preOrder(TreeNode root)
    {
        if(root==null)
            return;
        if(root!=null)
            System.out.println(root.val);
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


    boolean checkBST2(Node root) {
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
                output.get(i).add(j,current.val);
               j=0;
               i++;
                output.add(i,new ArrayList<Integer>());
            }
            else
            {

                output.get(i).add(j,current.val);
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

    public static TreeNode convertSortedArrayToBinaryTree(int[] arr)
    {
        TreeNode bst=null;
        int length=arr.length;
        int middleElement=arr[length/2];
        bst=new TreeNode(middleElement,null,null);
        bst.left=insertIntoLeftBST(bst,arr,0,(length/2)-1);
        bst.right=insertIntoRightBST(bst,arr,(length/2)-1,length-1);

        return bst;
    }

    public static TreeNode insertIntoLeftBST(TreeNode root,int[] arr, int start,int end)
    {
        TreeNode child=root;

        for(int k=end;k>=start;k--)
        {
            if(arr[k]<child.val)
            {
                child.left=new TreeNode(arr[k],null,null);
                child=child.left;
            }
            else if(arr[k]>root.val)
            {
                child.right=new TreeNode(arr[k],null,null);
                child=child.right;
            }
        }
        return root;
    }

    public static TreeNode insertIntoRightBST(TreeNode root,int[] arr, int start,int end)
    {
        TreeNode child=root;

        for(int k=start;k<=end;k++)
        {
            if(arr[k]<child.val)
            {
                child.left=new TreeNode(arr[k],null,null);
                child=child.left;
            }
            else if(arr[k]>root.val)
            {
                child.right=new TreeNode(arr[k],null,null);
                child=child.right;
            }
        }
        return root;
    }


   public static boolean checkBST(Node root) {
        return checkBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean checkBSTUtil(Node root,int min,int max)
    {
        if(root==null)
            return true;
        if(root.data<min || root.data>max)
            return false;


        return (checkBSTUtil(root.left,min,root.data) && checkBSTUtil(root.right,root.data,max));
    }

    static int max=0;
        static int min=0;
    public static int checkMax(Node root)
    {
        if(root==null)
            return max;
        else
            max=checkMax(root.left)>max?checkMax(root.left):max;
            max=checkMax(root.right)>max?checkMax(root.right):max;

            return max;
    }

    public static int checkMin(Node root)
    {
        if(root==null)
            return min;
        else
            min=checkMin(root.left)>min?checkMin(root.left):min;
        min=checkMin(root.right)>min?checkMin(root.right):min;

        return max;
    }

    static int p=0;
    static int output=0;
    public int kthSmallest(TreeNode root, int k) {
        p=0;
        output=0;
        inOrderTraversal2(root,k);
        return output;

    }

    public void inOrderTraversal2(TreeNode node,int k)
    {
        if (node==null)
            return;
        else
        {
            inOrderTraversal2(node.left,k);
            p++;
            if(p==k)
                output=node.val;


            inOrderTraversal2(node.right,k);
        }
    }

    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        else
            list= inorderTraversal(root.left);
        if(list==null)
        {
            //list=new ArrayList<>();
            list.add(root.val);
        }
        else
            list.add(root.val);

        list=inorderTraversal(root.right);
        return list;
    }


    public static boolean isBST(TreeNode root)
    {
        return BSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        //return false;
    }

    public static boolean BSTUtil(TreeNode root,int min,int max)
    {
        if(root==null)
            return true;

        if(root.val<min || root.val>max)
            return false;

        return (BSTUtil(root.left,min,root.val-1) && BSTUtil(root.right,root.val+1,max));
    }




    public static  void main(String[] args)
    {
        int[] arr={-10,-3,0,5,9};

        TreeNode test=convertSortedArrayToBinaryTree(arr);
    }
}
