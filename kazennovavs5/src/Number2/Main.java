package Number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
           int c = scanner.nextInt();
           a[i] = c;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1){
                Circle circle = new Circle(scanner.nextInt());
                System.out.println(circle.calculateArea());
            } else if (a[i] == 2){
                Triangle triangle = new Triangle(scanner.nextInt(), scanner.nextInt());
                System.out.println(triangle.calculateArea());
            } else if (a[i] == 3){
                Square square = new Square(scanner.nextInt());
                System.out.println(square.calculateArea());
            }
        }
    }
}