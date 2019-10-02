package lab1;

public class Monitor {
    String color;
    float length;
    float width;
    String resolution;
    //Constructor declaration of class
    public Monitor(String color, float length, float width, String resolution){
        this.color = color;
        this.length = length;
        this.width = width;
        this.resolution = resolution;
    }
    //method 1
    public String getColor(){
        return color;
    }
    //method 2
    public float getLength(){
        return length;
    }
    //method 3
    public float getWidth(){
        return width;
    }
    //method 4
    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return("The monitor color is " + this.getColor() + "\nIt has the length " + this.getLength() +
                " and the width " + this.getWidth() +"\nThe resolution is " + this.getResolution());
    }
}
