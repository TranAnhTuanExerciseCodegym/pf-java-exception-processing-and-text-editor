package classArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        System.out.println("Array :");
        int[] array = arrayExample.createRadom();
        System.out.println();
        System.out.println("enter index: ");
        int index = scanner.nextInt();
        try {
            System.out.println("index " + index + " value " + array[index]);
        } catch (IndexOutOfBoundsException  e) {
            System.out.println("error exceeds the length of the array " + e.getMessage());
        }
    }
}
