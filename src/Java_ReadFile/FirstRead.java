package Java_ReadFile;

import java.io.FileReader;
import java.io.IOException;

public class FirstRead {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\Java_FirstRead.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
