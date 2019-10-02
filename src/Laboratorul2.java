public class Laboratorul2 {
    public static void main (String args[]){
        FirstConstructor c1 = new FirstConstructor();
        System.out.println("Default constructor have the following values for instance variables:\n"+c1.width+" "+
                        c1.depth+" "+c1.height+"\n");
        SecondConstructor c2 = new SecondConstructor(2.5f);
        System.out.println("Second constructor have the following values for instance variables:\n"+c2.width+" "+
                            c2.depth+" "+c2.height);
        ThirdConstructor c3 = new  ThirdConstructor(1.4f, 2.3f, 4.7f);
        System.out.println("Third constructor have the following values for instance variables:\n"+c3.height+" "+
                            c3.width+" "+c3.depth);
        Queue q1 = new Queue(10);
        Queue q2 = new Queue();
        q1.pushQueue(1);
        q1.pushQueue(2);
        q1.pushQueue(3);
        q1.popQueue();
        q2.pushQueue(4);
        q2.pushQueue(5);
        q2.pushQueue(6);
        q2.popQueue();
        c3.calculateArea();
        c3.calculateVolume();
        q1.isEmpty();
        q1.isFull();
    }
}
