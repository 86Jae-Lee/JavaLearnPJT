package C_Test_Lv0;

import java.io.*;
import java.util.stream.Stream;

public class Maximum_Frequency {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] array = Stream.of(str).mapToInt(Integer::parseInt).toArray();

    }

    public static int solution(int[] array){
        int answer = 0;
        int index[] = new int[1001];
        for(int i=0 ; i<array.length-1 ; i++){
            index[array[i]]++;
        }
        int max = 0;
        for(int i=0 ; i<index.length ; i++){
            if(index[i]>max){
                max = index[i];
                answer = i;
            } else if (index[i]==max) {
                return -1;
            }
        }
        return answer;
    }
}
