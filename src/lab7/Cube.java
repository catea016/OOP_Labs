package lab7;

public class Cube extends GeometricBody {

    float length = 3;


    @Override
    public double getArea() {
        return 6*length*length;
    }

    @Override
    public double getVolume() {
        return length*length*length;
    }
}
