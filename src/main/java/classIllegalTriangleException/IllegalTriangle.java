package classIllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        checkSide();
    }

    private static void checkSide() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter a checkSide 1");
            int a = scanner.nextInt();
            System.out.println("enter a checkSide 2");
            int b = scanner.nextInt();
            System.out.println("enter a checkSide 3");
            int c = scanner.nextInt();
            if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("error a side or sum side 1 + side 2 < side 3");
        }
    }

}
