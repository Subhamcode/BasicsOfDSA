package LinkedLists;

import java.util.Scanner;

public class DeleteNodeInLL {

    static Node<Integer>delete(Node<Integer>head,int pos){
        if(pos==0&&head==null){
            return null;
        }
        else if(pos==0&&head.next!=null){
            head=head.next;
            return head;
        }else{
            Node<Integer>temp=head;
            int count=0;
            while(count<pos-1&&temp.next!=null){
                temp=temp.next;
                count++;
            }
            if(temp!=null&&temp.next!=null){
                temp.next=temp.next.next;
            }
        }
        return head;
    }

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

    public static void main(String[] args) {
        Node<Integer>head=takeInput();
        head=delete(head,2);
        print(head);
    }
}
