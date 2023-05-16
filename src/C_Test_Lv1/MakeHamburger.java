package C_Test_Lv1;

import java.io.*;
import java.util.stream.Stream;

public class MakeHamburger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] ingredient = Stream.of(str).mapToInt(Integer::parseInt).toArray();
        bw.write(solution(ingredient));
        bw.flush();
    }

    public static int solution(int[] ingredient){
        int length = ingredient.length;
        for(int i=0 ; i<length-3 ; i++){

        }



        int answer = 0;
        return answer;
    }
}
