package com.company;

public class HackerRank_PostOrderTreeTraversal {

    public static void preOrder(Node root) {

        if(root==null)
            return;
        if(root.left == null && root.right==null)
            System.out.print(root.data+" ");
        else

        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data+" ");


    }
}
