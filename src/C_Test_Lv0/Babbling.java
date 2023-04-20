package C_Test_Lv0;

import java.io.*;

public class Babbling {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] babbling = br.readLine().split(" ");
        int answer = solution(babbling);
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int solution(String[] babbling){
        String[] example = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String tempBabbling : babbling){
            for(String tempExample : example){
                tempBabbling = tempBabbling.replaceFirst(tempExample, " ");
            }
            if(tempBabbling.trim().length()==0) answer++;
        }
        return answer;
    }
}
