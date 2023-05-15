package C_Test_Lv1;

import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class Lotto_High_Low {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str1 = br.readLine().split(" ");
        String[] str2 = br.readLine().split(" ");
        int[] lottos = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
        int[] win_nums = Arrays.stream(str2).mapToInt(Integer::parseInt).toArray();


    }
    public int[] solutions(int[] lottos, int[] win_nums) {
        int checkNum = 0;
        Arrays.sort(lottos);
        int zeroCheck = 0;
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) zeroCheck++;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) checkNum++;
            }
        }
        int[] answer = new int[2];
        answer[1] = change(checkNum);
        answer[0] = answer[1]-zeroCheck+1;
        return answer;
    }
    public int change(int num){
        return 7-num;
    }
}
