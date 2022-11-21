package Number1;

public class Square implements Area{
    int a;

    @Override
    public float calculateArea() {
        float s = a * a;
        return s;
    }

    public Square(int a) {
        this.a = a;
    }
}
