package BeakJoon_GeneralMathmatics;

import java.io.*;
import java.util.*;

public class Bj2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        long move = Integer.parseInt(st1.nextToken());
        long reduce = Integer.parseInt(st1.nextToken());
        long height = Integer.parseInt(st1.nextToken());
        height -= move;
        move -= reduce;
        long result = (int)Math.ceil((double)height/move) + 1;
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}