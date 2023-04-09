package BeakJoon_Squar_Tri;

import java.io.*;
import java.util.*;
public class Bj3009 {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x,y,a,b,w,h;
        x = sc.nextInt();
        y = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();

        bw.write(String.valueOf(finddot(x, a, w))+" "+String.valueOf(finddot(y, b, h)));
        bw.flush();
        bw.close();
    }

    static int finddot(int a, int b, int c) {
        int answer = 0;
        if (a==b)
            answer = c;
        if (a==c)
            answer = b;
        if (b==c)
            answer = a;
        return answer;
    }
}