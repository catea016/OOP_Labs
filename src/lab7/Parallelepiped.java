package lab7;

public class Parallelepiped implements GeometricBody {
    private double height;
    private double width;
    private double depth;

    public Parallelepiped(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getSurface(){
        double surface;
        surface = 2*(height*width+height*depth+depth*height);
        return surface;
    }

    public double getVolume(){
        double volume;
        volume = height*width*depth;
        return volume;
    }

}
