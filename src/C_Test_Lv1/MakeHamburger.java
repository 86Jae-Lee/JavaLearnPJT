package C_Test_Lv1;

import java.io.*;
import java.util.Stack;
import java.util.stream.Stream;

public class MakeHamburger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int[] ingredient = Stream.of(str).mapToInt(Integer::parseInt).toArray();
        bw.write(solution(ingredient));
        bw.flush();
    }

    public static int solution(int[] ingredient){
        int answer = 0;

        Stack<Integer> inStack = new Stack<Integer>();

        for(int in : ingredient){
            inStack.push(in);

            if(inStack.size() >=4){
                if(inStack.get(inStack.size()-4)==1
                        && inStack.get(inStack.size()-3)==2
                        && inStack.get(inStack.size()-2)==3
                        && inStack.get(inStack.size()-1)==1
                ) {
                    answer++;
                    inStack.pop(); inStack.pop(); inStack.pop(); inStack.pop();
                }
            }
        }
        return answer;
    }
}
