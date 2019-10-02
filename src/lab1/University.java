package lab1;

public class University {
    int foundationYear;
    String name;
    Student[] students = new Student[2];
    University(int foundationYear, String name){
        this.foundationYear = foundationYear;
        this.name = name;
    }
    public float getAverage(){
        int n=2;
        int a[]=new int[n];
        float result = 0;
        for (int i = 0; i < n; i++) {
            result += students[i].mark;
        }

        return result/n;
    }
}
