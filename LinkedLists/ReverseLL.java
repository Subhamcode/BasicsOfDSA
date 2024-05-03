package LinkedLists;

import java.util.Scanner;

public class ReverseLL {
    static Node<Integer>takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data!=-1){
            Node<Integer>node=new Node<>(data);
            if(head==null){
                head=node;
                tail=node;
            }else{
                tail.next=node;
                tail=tail.next;
            }
            data=sc.nextInt();
        }
        return head;
    }

    static void print(Node<Integer>head){
        Node<Integer>temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }

    static Node<Integer>reverseLL(Node<Integer>head){
//        if(head==null){
//            return null;
//        }
        Node<Integer>prev=null;
        Node<Integer>curr=head;
        while(curr!=null){
            Node<Integer>newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node<Integer>head=takeInput();

        print(head);
        head=reverseLL(head);
        System.out.println();
        print(head);
    }
}
