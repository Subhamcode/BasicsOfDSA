package Queue;

import LinkedLists.Node;

public class QueueUsingLL<T> {

    private Node<T> front;
    private Node<T> rear;

    public int size;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(T elem){
        Node<T>node =new Node<>(elem);
        size++;
        if(front==null){
            front=node;
            rear=node;
        }else{
            rear.next=node;
            rear=rear.next;
        }
    }

    public T front(){

        if(front==null){
            System.out.println("queue is empty..");
            return null;
        }
        return front.data;
    }

    public T dequeue(){

        if(front==null){
            System.out.println("cannot dequeue from an empty queue");
            return null;
        }
        T temp=front.data;
        front=front.next;
        if(front==rear){
            rear=null;
        }
        size--;
        return temp;
    }
}
