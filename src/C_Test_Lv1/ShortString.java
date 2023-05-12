package C_Test_Lv1;

import java.io.*;

public class ShortString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String t; String p;
        t = br.readLine();
        p = br.readLine();
        bw.write(String.valueOf(solution(t, p)));
        bw.flush();
    }
    static int solution(String t, String p){
        String[] str1 = t.split("");
        int size = p.length();
        int pNum = Integer.parseInt(p);
        for(int i=0 ; i<str1.length-size+1 ; i++){
            StringBuilder stb;
            for(int j=0 ; j<size ; j++){
                stb = new StringBuilder()
            }
        }



        int answer = 0;
        return answer;
    }
}


