package BeakJoon_PrimeNum_ETC;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Bj9506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> listA = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if(num==-1) break;
            listA.add(num);
        }
        for (int i=0 ; i<listA.size() ; i++) {
            divisor(listA.get(i));
        }
    }

    static void divisor(int num) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> listDivisor = new ArrayList<>();
        for (int i=1 ; i*i<=num ; i++) {
            if(i*i==num) listDivisor.add(i);
            else if(num%i==0) {
                listDivisor.add(i);
                listDivisor.add(num/i);
            }
        }
        listDivisor.remove(Integer.valueOf(num));
        Collections.sort(listDivisor);

        StringBuilder stb = new StringBuilder(num + " =");
        for(int i=0 ; i<listDivisor.size() ; i++) {
            stb.append(" "+listDivisor.get(i));
            if(i!=listDivisor.size()-1) {
                stb.append(" +");
            }
        }
        int sum = 0;
        for(int i : listDivisor) {
            sum += i;
        }

        if(sum==num) {
            bw.write(stb.toString());
        } else {
            bw.write(String.valueOf(num) + " is NOT perfect.");
        }
        bw.write("\n");
        bw.flush();
    }
}