package LinkedLists;

import java.util.Scanner;

public class InsertInLL {

    static Node<Integer> insert(Node<Integer>head,int data,int pos){
        Node<Integer>node=new Node<>(data);
        if(head==null&&pos==0){
            node.next=head;
            head=node;
            return head;
        }else if(pos>0&&head==null){
            return null;
        }else{
            Node<Integer>temp=head;
            int count=0;
            while(count<pos-1&&temp!=null){
                temp=temp.next;
                count++;
            }
            if(temp!=null){
                node.next=temp.next;
                temp.next=node;
            }
        }
        return head;
    }

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
        head=insert(head,45,0);
        print(head);
    }
}
