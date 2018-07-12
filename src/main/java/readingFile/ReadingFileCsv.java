package readingFile;

import java.io.*;

public class ReadingFileCsv {
    public static void main(String[] args) {
        ReadingFileCsv readingFileCsv = new ReadingFileCsv();
        readingFileCsv.readingFile();
    }

    private void readingFile() {
        try {
            File file = new File("./src/main/resources/csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                String[] arr = line.split("0");
                for (String x : arr) {
                    System.out.print(x);
                }
                count++;
                System.out.println(count);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
