package C_Test_Lv0;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Change_Sequence {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" "); // String ->Int 배열 형변환
        int[] arr = Stream.of(str).mapToInt(Integer::parseInt).toArray();
        bw.write(Arrays.toString(solution(arr)));
        bw.flush();
    }

    public static int[] solution(int[] arr){
        int[] answer = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>=50&&arr[i]%2==0) answer[i]=arr[i]/2;
            else if(arr[i]<50&&arr[i]%2!=0) answer[i] = arr[i]*2;
            else answer[i] = arr[i];
        }
        return answer;
    }
}
