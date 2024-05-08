package PriorityQueues;

import java.util.ArrayList;

public class Priority_Queue<T> {

    public ArrayList<Element<T>> heap;

    public Priority_Queue() {
        heap = new ArrayList<>();
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public T getMin() {
        if (size() == 0) {
            System.out.println("heap is empty..cannot find minimum");
            return null;
        }
        return heap.get(0).value;
    }

    public void insert(T value, int priority) {
        Element<T> elem = new Element<>(value, priority);
        heap.add(elem);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;

            } else {
                return;
            }
        }
    }

    public T removeMin(){
        if(size()==0){
            System.out.println("cannot remove from empty queue");
            return null;
        }
        Element<T>removed=heap.get(0);
        T ans=removed.value;

        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int paretIndex=0;
        int leftchildIndex=(2*paretIndex)+1;
        int rightchildIndex=(2*paretIndex+2);

        while(leftchildIndex<heap.size()){
            int minIndex=paretIndex;
            if(heap.get(leftchildIndex).priority<heap.get(minIndex).priority){
                minIndex=leftchildIndex;

            }
            if(rightchildIndex< heap.size()&&heap.get(rightchildIndex).priority<heap.get(minIndex).priority){
                minIndex=rightchildIndex;
            }

            if(minIndex==paretIndex){
                break;
            }

            Element<T>temp=heap.get(minIndex);
            heap.set(minIndex,heap.get(paretIndex));
            heap.set(paretIndex,temp);
            paretIndex=minIndex;
            leftchildIndex=(2*paretIndex+1);
            rightchildIndex=(2*paretIndex+2);
        }
        return ans;
    }
}