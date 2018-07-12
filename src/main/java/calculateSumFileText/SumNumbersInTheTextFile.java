package calculateSumFileText;

import java.io.*;

public class SumNumbersInTheTextFile {
    public static void main(String[] args) {
        SumNumbersInTheTextFile sumNumbersInTheTextFile = new SumNumbersInTheTextFile();
        sumNumbersInTheTextFile.readingFileText();
    }

    private void readingFileText() {
        try {
            File file = new File("./src/main/resources/data");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedInputStream = new BufferedReader(fileReader);
            String line = "";
            int sum = 0;
            while ((line = bufferedInputStream.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("not find file text");
        } catch (IOException e) {
            System.out.println("no");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect characters");
        }
    }
}
