package C_Test_Lv0;

import java.io.*;

public class SumOfConsecutive {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        if(num%2!=0){
            int midNum = total/num;
            int firstNum = midNum-(num/2);
            for (int i=0 ; i<num ; i++){
                answer[i] = firstNum+i;
            }
        } else {
            int midNum = total/num;
            int firstNum = midNum-(num/2)+1;
            for (int i=0 ; i<num ; i++){
                answer[i] = firstNum+i;
            }
        }
        return answer;
    }
}