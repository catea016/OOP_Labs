package lab1;

public class Lab_1 {
    public static void main(String[] args) {
        Monitor firstMonitor = new Monitor("red", 23.7f, 15.3f, "FULL HD");
        System.out.println(firstMonitor.toString());
        Monitor secondMonitor = new Monitor("blue", 32.5f, 20.6f, "HD");
        System.out.println(secondMonitor.toString());
        if (firstMonitor.length > secondMonitor.length) {
            System.out.println("\nFirst Lab1.Monitor is grater than second");
        } else if (firstMonitor.length < secondMonitor.length) {
            System.out.println("\nThe second monitor is grater than the first");
        }
        Student st_1 = new Student("Vadim", 20, 8.5f);
        Student st_2 = new Student("Andrei", 21, 9.8f);
        Student st_3 = new Student("Ion", 19, 6.7f);
        Student st_4 = new Student("Maxim", 20, 10.0f);
        University un_1 = new University(1998, "UTM");
        University un_2 = new University(2000, "USM");
        un_1.students[0] = st_1;
        un_1.students[1] = st_2;
        un_2.students[0] = st_3;
        un_2.students[1] = st_4;
        float averageUniversity1;
        averageUniversity1 = un_1.getAverage();
        float averageUniversity2;
        averageUniversity2 = un_2.getAverage();
        System.out.println("\n\nMedia aritmetica pentru prima universitate este: " + averageUniversity1 +
                "\nMedia aritmetica pentru a doua universitate este: " + averageUniversity2);
    }
}
