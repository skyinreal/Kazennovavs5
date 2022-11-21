package Number1;

import Number1.Circle;
import Number1.Square;
import Number1.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1){
            Circle circle = new Circle(scanner.nextInt());
            System.out.println(circle.calculateArea());
        } else if (x == 2){
            Triangle triangle = new Triangle(scanner.nextInt(), scanner.nextInt());
            System.out.println(triangle.calculateArea());
        } else if (x == 3){
            Square square = new Square(scanner.nextInt());
            System.out.println(square.calculateArea());
        }
    }
}