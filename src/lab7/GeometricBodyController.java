package lab7;

public class GeometricBodyController {
    static public double getBiggestSurface(GeometricBody[] geometricBodies){
        double maxSurface = 0;
        for(int i = 0;i<geometricBodies.length;i++)
        {
           if( maxSurface < geometricBodies[i].getSurface())
           {
               maxSurface = geometricBodies[i].getSurface();
           }
        }
        return maxSurface;
    }

    static public double getBiggestVolume(GeometricBody[] geometricBodies){
        double maxVolume = 0;
        for(int i = 0;i<geometricBodies.length;i++)
        {
            if( maxVolume < geometricBodies[i].getVolume())
            {
                maxVolume = geometricBodies[i].getVolume();
            }
        }
        return maxVolume;
    }
}
