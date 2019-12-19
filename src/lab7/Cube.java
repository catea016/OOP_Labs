package lab7;

public class Cube implements GeometricBody {
     public double length;


     public Cube (double length){
         this.length=length;
     }

     public double getSurface(){
         double surface;
         surface= 6 * (length * length);
                 return surface;
     }

     public double getVolume(){
         double volume;
         volume = length*length*length;
         return volume;
     }
}
