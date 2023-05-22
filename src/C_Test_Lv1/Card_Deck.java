package C_Test_Lv1;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Card_Deck {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] cards1 = br.readLine().split(" ");
        String[] cards2 = br.readLine().split(" ");
        String[] goal = br.readLine().split(" ");
        bw.write(solution(cards1, cards2, goal));
        bw.flush();
    }

    static String solution(String[] cards1, String[] cards2, String[] goal){
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(int i=0 ; i<cards1.length ; i++){
            q1.offer(cards1[i]);
        }
        for(int i=0 ; i<cards2.length ; i++){
            q2.offer(cards1[i]);
        }
        boolean check = true;
        for(int i=0 ; i<goal.length ; i++){
            if(q1.peek()==goal[i]) q1.poll();
            else if(q2.peek()==goal[i]) q2.poll();
            else check = false;
        }
        String answer = "";
        if (check==true) answer = "Yes";
        else answer = "No";
        return answer;
    }
}