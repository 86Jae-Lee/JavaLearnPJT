package C_Test_Lv0;

import java.io.*;

public class NextNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    }

    public int Solution(int[] common) {
        int len = common.length-1;
        int num1 = common[len]-common[len-1];
        int num2 = common[len-1]-common[len-2];
        if(num1==num2) return common[len]+num1;
        else return common[len]*(common[len]/common[len-1]);
    }

}
