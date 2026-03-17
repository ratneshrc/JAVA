import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadExternalFile {
    public static void main(String[] args) {
        try {
            File file = new File("D:/sample.txt");   

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}