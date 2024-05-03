package BinaryTrees;

import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class IsBinaryTreeBalanced {

    static boolean isBinaryTreeBalanced(BinaryTreeNode<Integer>root){
        if(root==null){
            return true;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if(Math.abs(leftheight-rightheight)>1){
            return false;
        }
        return isBinaryTreeBalanced(root.left)&&isBinaryTreeBalanced(root.right);
    }

    static int height(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return 1+Math.max(leftheight,rightheight);
    }

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

    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=create(false,true,0);
        //print(root);
        System.out.println(isBinaryTreeBalanced(root));
    }
}
