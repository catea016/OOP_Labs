package lab7;

public class Parallelepiped extends GeometricBody {

    float width = 5 ;
    float height  = 2;
    float depth = 4 ;

    @Override
    public double getArea() {
        return 2*(width*height + height*depth + depth*width);
    }

    @Override
    public double getVolume() {
        return width*height*depth;
    }
}
