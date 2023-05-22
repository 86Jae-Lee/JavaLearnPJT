package C_Test_Lv1;

import java.io.*;
import java.util.Arrays;

public class Rough_Keyboard {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] keymap = br.readLine().split(" ");
        String[] targets = br.readLine().split(" ");
        bw.write(Arrays.toString(solution(keymap, targets)));
    }

    static int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};





        return answer;
    }
}