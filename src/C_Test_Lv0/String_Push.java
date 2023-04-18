package C_Test_Lv0;

import java.io.*;

public class String_Push {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    }

    public int solution(String A, String B){
        int aLength = A.length();
        String[] a = A.split("");
        String[] b = B.split("");
        for (int i=1 ; i<aLength ; i++){
            String tmp = "";
            for (int j=0 ; j<aLength ; j++){
                a[j] = a[j+1];

            }
        }


        int answer = 0;
        return answer;
    }
}
