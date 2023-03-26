package Queue;

public class QueueUsingArray {
    int arr[];
    int front;
    int rear;

    QueueUsingArray(int n){
        arr = new int[n];
        front=0;
        rear = -1;
    }
    
    public int size(){
        return arr.length;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear == arr.length-1;
    }

    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }

        int data = arr[front];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }

        rear--;

        return data;
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());

        q.add(5);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        System.out.println(q.remove());
        System.out.println(q.remove());
        
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());



    }

}
