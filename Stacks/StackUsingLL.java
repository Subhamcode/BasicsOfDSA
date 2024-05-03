package Stacks;

import LinkedLists.Node;

public class StackUsingLL<T> {

    private Node<T> head;
    private int size;
    public boolean isEmpty(){
        return head==null;
    }

    public int size(){
        return size;
    }

    public void push(T elem){
        Node<T> node=new Node<>(elem);
            node.next=head;
            head=node;
            size++;
    }

    public T top(){
            if(size==0){
                return null;
            }
            return head.data;
    }

    public T pop(){
        if(head==null){
            System.out.println("cannot pop from empty stack...");
            return null;
        }
        T temp=head.data;
        head=head.next;
        size--;
        return temp;
    }
}
