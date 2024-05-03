package Queue;

public class QueueUse {

    public static void main(String[] args) {
        QueueUsingLL<Integer>queue=new QueueUsingLL<>();
        queue.enqueue(15);
        queue.enqueue(16);
        queue.enqueue(17);
        queue.enqueue(18);

        System.out.println(queue.front());
        

    }
}
