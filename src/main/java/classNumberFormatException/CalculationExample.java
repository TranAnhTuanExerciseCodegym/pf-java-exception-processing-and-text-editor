package classNumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = scanner.nextInt();
        System.out.println("enter b: ");
        int b = scanner.nextInt();
        calculate(a, b);
    }

    private static void calculate(int a, int b) {
        try {
            int c = a + b;
            int d = a - b;
            int e = a * b;
            int f = a / b;
            System.out.println("Tổng a + b = " + c);
            System.out.println("Hiệu a - b = " + d);
            System.out.println("Tích a * b = " + e);
            System.out.println("Thương a / b = " + f);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}