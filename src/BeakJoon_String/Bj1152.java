package BeakJoon_String;

import java.io.*;
import java.util.Objects;

public class Bj1152 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] strings = str.split(" ");
        int length = strings.length;
        String st = "";
        if(Objects.equals(strings[0], st)&&(Objects.equals(strings[length-1], st))) bw.write(String.valueOf(length-2));
        if(Objects.equals(strings[0], st)) bw.write(String.valueOf(length-1));
        else if (Objects.equals(strings[length-1], st)) bw.write(String.valueOf(length-1));
        else bw.write(String.valueOf(length));
        bw.flush();
    }
}