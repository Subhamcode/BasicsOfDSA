package LinkedLists;

import java.util.Scanner;

public class TakeLLInput {

    static Node<Integer> takeinput(){
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

    public static void main(String[] args) {
        Node<Integer>head=takeinput();
        print(head);
    }
}
