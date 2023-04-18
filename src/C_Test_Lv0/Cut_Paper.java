package C_Test_Lv0;

import java.io.*;

public class Cut_Paper {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    }

    public int solution(int M, int N){
        int smallSide = 0;
        int bigSide = 0;
        if (M>N){
            smallSide = N-1;
            bigSide = (M-1) * N;
        } else {
            smallSide = M-1;
            bigSide = (N-1) * M;
        }
        return smallSide+bigSide;
    }
}