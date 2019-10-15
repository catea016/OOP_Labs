package lab2;

public class Laboratorul2 {
    public static void main (String args[]){
        Box box1 = new Box();
        System.out.println("Default constructor have the following values for instance variables:\n"+box1.width+" "+
                        box1.depth+" "+box1.height+"\n");
        Box box2 = new Box(2.5f);
        System.out.println("Second constructor have the following values for instance variables:\n"+box2.width+" "+
                            box2.depth+" "+box2.height);
        Box box3 = new  Box(1.4f, 2.3f, 4.7f);
        System.out.println("Third constructor have the following values for instance variables:\n"+box3.height+" "+
                box3.width+" "+box3.depth);
        Queue queue1 = new Queue(10);
        Queue queue2 = new Queue();
        queue1.pushQueue(1);
        queue1.pushQueue(2);
        queue1.pushQueue(3);
        queue1.popQueue();
        queue2.pushQueue(4);
        queue2.pushQueue(5);
        queue2.pushQueue(6);
        queue2.popQueue();
        System.out.println("The area is: "+box3.calculateArea());
        System.out.println("The volume is: "+box3.calculateVolume());
        queue1.isEmpty();
        queue1.isFull();
    }
}
