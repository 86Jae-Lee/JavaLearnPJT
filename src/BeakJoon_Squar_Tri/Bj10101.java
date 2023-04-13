package BeakJoon_Squar_Tri;

import java.io.*;

public class Bj10101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int an1 = Integer.parseInt(br.readLine());
        int an2 = Integer.parseInt(br.readLine());
        int an3 = Integer.parseInt(br.readLine());

        int sum = an1+an2+an3;
        if(sum==180){
            if(an1==an2&&an2==an3) bw.write("Equilateral");
            else if (an1!=an2&&an2!=an3&&an1!=an3) bw.write("Scalene");
            else bw.write("Isosceles");
        } else bw.write("Error");
        bw.flush();
    }
}