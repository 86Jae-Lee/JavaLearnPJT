package C_Test_Lv1;

import java.io.*;
import java.util.stream.Stream;

public class Push_KeyPad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] numbers = Stream.of(str).mapToInt(Integer::parseInt).toArray();
        String hand = br.readLine();
        bw.write(solution(numbers, hand));
        bw.flush();
    }

    static String solution(int[] numbers, String hand) {
        String str;
        String answer = "";
        int left = 10; int right = 12;
        for(int tmp: numbers){
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp;
            } else if (tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp;
            } else {
                if(tmp==0) tmp = 11;
                int leftDist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightDist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;

                if(leftDist<rightDist){
                    answer+="L";
                    left = tmp;
                } else if(rightDist<leftDist){
                    answer+="R";
                    right = tmp;
                } else {
                    if(hand.equals("left")){
                        answer+="L";
                        left = tmp;
                    } else {
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }
}