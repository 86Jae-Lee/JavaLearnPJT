package Test_For_Inherite;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        text = text.toLowerCase();
        countWords(text);

    }

    static void countWords(String text) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        StringTokenizer stt = new StringTokenizer(text, " ");


    }
}
