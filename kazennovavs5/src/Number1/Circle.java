package Number1;

public class Circle implements Area{
    int r;
    final static float pi = (float) Math.PI;
    @Override
    public float calculateArea() {
        float s = pi * r * r;
        return s;
    }

    public Circle(int r) {
        this.r = r;
    }
}
