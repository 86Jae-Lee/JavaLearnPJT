package JavaGrammar;

import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Grammar {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" "); // String ->Int 배열 형변환
        int[] array = Stream.of(str).mapToInt(Integer::parseInt).toArray();

        int num = 100;
        int[] line = IntStream.range(1, num+1).toArray(); // 1 ~ num 까지 배열 1,2,3,~

    }
}