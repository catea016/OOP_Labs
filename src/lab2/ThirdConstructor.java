package lab2;

public class ThirdConstructor {
    float height;
    float width;
    float depth;
    ThirdConstructor(float h, float w, float d){
        height = h;
        width = w;
        depth = d;
    }
    public float calculateArea(){
        float a = 2*(height*width + width*depth + height*depth);
        System.out.println("\nThe surface area of the box is : " + a);
        return a;
    }
    public float calculateVolume(){
        float v = height*width*depth;
        System.out.println("\nThe box volume is : " + v);
        return  v;
    }
}
