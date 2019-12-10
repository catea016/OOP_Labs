package lab7;

public class GeometricBodyController {

    public float getBiggestVolume(String[] GeometricBodys){
        String maxVolume;
        for(int i = 0; i<=GeometricBodys.length; i++){
            if(GeometricBodys[i + 1] < GeometricBodys[i]) {
                maxVolume = GeometricBodys[i];
            }
        }

    }
    public float getBiggestSurface(){

    }
}
