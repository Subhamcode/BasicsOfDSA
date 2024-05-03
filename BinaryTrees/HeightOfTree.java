package BinaryTrees;

import java.util.Scanner;

public class HeightOfTree {

    static BinaryTreeNode<Integer>create(boolean isleft,boolean isroot,int parent){
        Scanner sc=new Scanner(System.in);
        if(isroot){
            System.out.println("enter root data");
        }else{
            if(isleft){
                System.out.println("enter left of "+parent);
            }else{
                System.out.println("enter right of "+parent);
            }
        }
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(data);
        BinaryTreeNode<Integer>rootleft=create(true,false,data);
        BinaryTreeNode<Integer>rootright=create(false,false,data);
        root.left=rootleft;
        root.right=rootright;
        return root;
    }

    static void print(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" :");
        if(root.left!=null){
            System.out.print("L"+root.left.data);
        }
        if(root.right!=null){
            System.out.print(",R"+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }


    static int height(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return 1+Math.max(leftheight,rightheight);
    }

    static int heightOfTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }

        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=create(false,true,0);
        //print(root);
        //int result=height(root); //height considerign that if only a  single node is present  height is zero
        int r=heightOfTree(root);//height considering that a single node preseent is tree represents height 1
        System.out.println("height of tree is "+r);
    }
}
