package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollectionsFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        System.out.println(q.size());
        System.out.println(q.isEmpty());

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.size());
        System.out.println(q.isEmpty());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.println(q.remove());
        System.out.println(q.remove());
    
        q.add(5);
    }
}
