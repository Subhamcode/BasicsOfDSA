package BinaryTrees;

import java.util.Scanner;

public class TreeTraversals {

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

    static void printPreOrder(BinaryTreeNode<Integer>root){
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
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    static void PrintPostOrder(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        PrintPostOrder(root.left);
        PrintPostOrder(root.right);
        System.out.println(root.data);


    }

    static void inOrder(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=create(false,true,0);
        printPreOrder(root); //preOrder traversal of binary Tree
        PrintPostOrder(root);//post Order traversal of binaryTree
        inOrder(root); //in order traversal of binary Tree

    }
}
