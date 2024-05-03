package BinaryTrees;

import java.util.Scanner;

public class RemoveLeafNodes {

    static BinaryTreeNode<Integer>removeleaf(BinaryTreeNode<Integer>root){
        if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return null;
        }
        root.left=removeleaf(root.left);
        root.right=removeleaf(root.right);
        return root;
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
        root=removeleaf(root);
        print(root);
    }
}
