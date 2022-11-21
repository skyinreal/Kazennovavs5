package Number1;

public class Triangle implements Area{
    int a;
    int b;

    @Override
    public float calculateArea() {
       float s = 0.5f * a * b;
        return s;
    }

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
