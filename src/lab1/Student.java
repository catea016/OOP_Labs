package lab1;

public class Student {
    String name;
    int age;
    float mark;
    public Student(String name, int age, float mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public float getMark() {
        return mark;
    }
    public String toString(){
        return("The student name is: " + this.getName() + "\nLab1.Student age: " + this.getAge() + "\nLab1.Student mark: " +
                this.getMark());
    }
}
