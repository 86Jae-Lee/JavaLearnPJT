package C_Test_Lv0;

import java.io.*;

public class Parallel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    }

    public static int solution(int[][] dots){
        int answer = 0;
        float[] line = new float[6]; //기울기 세는 배열

        //index 로 돌리면서 바로 line 에 채움
        int index = 0;

        for(int i=0 ; i<3 ; i++){
            for(int j=i+1; j<4 ; j++){
                float result
                        = (float)(dots[i][1] - dots[j][1])
                        / (float)(dots[i][0] - dots[j][0]);
                line[index] = result;
                index++;
            }
        }

        //평행 체크
        for(int k=0 ; k<line.length-1 ; k++){
            for(int m=k+1 ; m<line.length ; m++){
                if(line[k] == line[m]) return 1;
            }
        }
        return answer;
    }
}
