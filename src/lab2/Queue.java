package lab2;

public class Queue {
    int queue[];
    int capacity;
    int front;
    int rear;
    int count; //current size
   public Queue(int size){
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }
    public Queue(){
        queue = new int[30];
        capacity = 30;
        front = 0;
        rear = 0;
        count = 0;

    }

    public void pushQueue(int value){
        System.out.println("\nInserting " + value);
        queue[rear] = value;
        rear = (rear +1)%capacity;
        count++;

    }
    public int popQueue(){
        System.out.println("\nRemoving "+ queue[front]);
        int value = queue[front];
        front = (front + 1) % capacity;
        count--;
        return value;
    }
    public  int size(){
       return count;
    }

    public void isEmpty(){
       if(size()==0){
           System.out.println("\nlab2.Queue is not empty");;
       }
       else{
           System.out.println("\nlab2.Queue is not empty");
       }
    }
    public void isFull(){
       if(size()==capacity){
           System.out.println("\nlab2.Queue is full");
       }
       else{
           System.out.println("\nThe size of queue is : " + size() );

       }
    }


}
