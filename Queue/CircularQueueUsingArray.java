package Queue;

public class CircularQueueUsingArray {
    int arr[];
    int front;
    int rear;

    CircularQueueUsingArray(int n){
        arr = new int[n];
        front=-1;
        rear = -1;
    }
    
    public int size(){
        return arr.length;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return (rear+1)%arr.length == front;
    }

    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        if(front == -1){
            front++;
        }
        rear = (rear+1)%arr.length;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            return -1;
        }

        int data = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }else{

            front = (front+1)%arr.length;
        }
        return data;
    }

    public static void main(String[] args) {
        CircularQueueUsingArray q = new CircularQueueUsingArray(5);

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
