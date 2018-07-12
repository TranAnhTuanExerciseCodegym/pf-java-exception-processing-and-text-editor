package classArrayIndexOutOfBoundsException;


public class ArrayExample {

    public int[] createRadom() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        return array;
    }

}
