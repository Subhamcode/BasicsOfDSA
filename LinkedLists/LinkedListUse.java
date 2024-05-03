package LinkedLists;

public class LinkedListUse {

    static Node<Integer> create(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        n1.next=n2;
        n2.next=n3;
        return n1;
    }
    static void print(Node<Integer>head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
    }

    static void incrementLL(Node<Integer>head){
        Node<Integer>temp=head;

        while(temp!=null){
            temp.data++;
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head=create();
        incrementLL(head);
        //print(head);
    }
}
