import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        int vowels = 0, words = 0, countA = 0;

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                
                String[] w = line.split("\\s+");
                words += w.length;

               
                for (int i = 0; i < line.length(); i++) {
                    char ch = Character.toLowerCase(line.charAt(i));

                    if ("aeiou".indexOf(ch) != -1)
                        vowels++;
   
                    if (ch == 'a')
                        countA++;
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Count of 'a': " + countA);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
