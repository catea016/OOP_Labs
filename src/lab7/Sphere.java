package lab7;

public class Sphere implements GeometricBody  {
    public double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface(){
        double surface;
        surface = 4*Math.PI*(radius*radius);
        return surface;
    }

    public double getVolume(){
        double volume;
        volume = (4*Math.PI*radius*radius*radius)/3;
        return volume;
    }
}
