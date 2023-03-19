package BeakJoon_Study;

import java.io.*;

public class Bj2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int rd3 = Integer.parseInt(String.valueOf(str.charAt(2)));
        int rd2 = Integer.parseInt(String.valueOf(str.charAt(1)));
        int rd1 = Integer.parseInt(String.valueOf(str.charAt(0)));
        int num2 = Integer.parseInt(str);
        bw.write(String.valueOf(num1*rd3)+"\n");
        bw.write(String.valueOf(num1*rd2)+"\n");
        bw.write(String.valueOf(num1*rd1)+"\n");
        bw.write(String.valueOf(num1*num2));
        bw.flush();
    }
}
