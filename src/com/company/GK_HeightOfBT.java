package com.company;

public class GK_HeightOfBT {

    public static int heightOfBT(GK_BinaryTree.Node1 root)
    {
        if(root==null)
            return 0;
        else
        {
            int lheight=heightOfBT(root.left);
            int rheight=heightOfBT(root.right);

            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }
    public static void main(String[] args)
    {

    }
}
