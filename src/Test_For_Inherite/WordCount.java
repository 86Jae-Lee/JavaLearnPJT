package Test_For_Inherite;

import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String text = br.readLine();
        text = text.toLowerCase();
        countWords(text);

    }

    static void countWords(String text) {
        Map<String, Integer> map = new HashMap<>();
        String[] str = text.split(" ");
        int first = 1;
        for(int i=0 ; i<str.length ; i++){
            if(map.get(str[i])==null) {
                map.put(str[i], first);
            } else map.put(str[i], map.get(str[i]) + 1);
        }
        


    }
}
