package PriorityQueues;

public class PriorityQueueTest {

    public static void main(String[] args) {
        Priority_Queue<String>pq=new Priority_Queue<>();
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
        pq.insert("abc",10);
        pq.insert("def",7);
        pq.insert("xyz",4);
        pq.insert("pqr",2);

        System.out.println(pq.isEmpty());
        System.out.println(pq.size());

        System.out.println(pq.getMin());

        System.out.println("--------------------------------------");
        while(!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();

        }
    }
}
