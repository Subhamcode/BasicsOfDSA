package BinaryTrees;

import java.util.Scanner;
import java.util.*;
public class RootToNodePath {

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

    static List<Integer>rootToNodepath(BinaryTreeNode<Integer>root,int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            List<Integer>smallanswer=new ArrayList<>();
            smallanswer.add(root.data);
            return smallanswer;
        }
        List<Integer>leftoutput=rootToNodepath(root.left,x);
        if(leftoutput!=null){
            leftoutput.add(root.data);
            return leftoutput;
        }
        List<Integer>rightoutput=rootToNodepath(root.right,x);
        if(rightoutput!=null){
            rightoutput.add(root.data);
            return rightoutput;
        }
        return null;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=create(false,true,0);
        //print(root);
        List<Integer>output=rootToNodepath(root,5);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}
