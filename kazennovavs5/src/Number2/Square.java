package Number2;

import Number1.Area;

public class Square implements Area {
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
