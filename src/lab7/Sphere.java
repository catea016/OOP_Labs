package lab7;

public class Sphere extends GeometricBody {
    float pi = (float) 3.14;
    int radius = 2;


    @Override
    public double getArea() {
        return 4*pi*(radius^2);
    }

    @Override
    public double getVolume() {
        return (4*pi*(radius^2))/3;
    }
}
