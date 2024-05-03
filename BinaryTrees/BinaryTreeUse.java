package BinaryTrees;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> create(){
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(10);
        BinaryTreeNode<Integer>rootleft=new BinaryTreeNode<>(11);
        BinaryTreeNode<Integer>rootright=new BinaryTreeNode<>(12);

        root.left=rootleft;
        root.right=rootright;
        return root;
    }

    static void print(BinaryTreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print(root.left.data+"");
        }
        if(root.right!=null){
            System.out.print(","+root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=create();
        print(root);
    }
}
