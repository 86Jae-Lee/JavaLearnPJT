package C_Test_Lv1;

import java.io.*;

public class Crain_Doll {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));





    }

    public int solution(int[][] board, int[] moves){
        int deep = board[0].length;
        String str = "";
        for(int i=0 ; i<moves.length ; i++){
            int start = moves[i]-1;
            for(int j=0 ; j<deep ; j++){
                if(board[j][start]!=0) {
                    str.concat(String.valueOf(board[j][start]));
                    board[j][start] = 0;
                    break;
                }
            }
        }
        int answer = 0;
        String[] line = str.split("");
        for (int i=0 ; i<str.length()-1 ; i++){
            if(line[i]==line[i+1]){
                line[i] = "X";
                line[i+1] = "X";
                answer = answer + 2;
            }
        }

        return answer;
    }
}
