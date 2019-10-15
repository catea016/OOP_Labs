package lab2;

public class Box {
    float width = 1;
    float height = 1;
    float depth = 1;

    Box() {
    }

    Box(float f) {
        width = f;
        height = f;
        depth = f;
    }

    Box(float h, float w, float d) {
        height = h;
        width = w;
        depth = d;
    }

    public float calculateArea() {
        float a = 2 * (height * width + width * depth + height * depth);
        return a;
    }

    public float calculateVolume() {
        return height * width * depth;
    }
}
