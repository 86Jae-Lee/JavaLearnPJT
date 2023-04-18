package C_Test_Lv1;

import java.io.*;
import java.util.StringTokenizer;

public class CT_ParkWalk {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] park = new String[]{br.readLine()};
        String[] routes = new String[]{br.readLine()};

        solution(park, routes);


    }

    static int[] solution(String[] park, String[] routes) {
        String[][] splitPark = new String[park.length][park[0].length()];
        int pointX; int pointY;
        for(int i=0 ; i<park.length ; i++){
            String[] split = park[i].split("");
            for(int j=0 ; j<park[0].length() ; j++){
                splitPark[i][j] = split[j];
                if(split[j]=="S") pointX = i; pointY = j;
            }
        }
        String[] bearing = new String[routes.length];
        int[] distance = new int[routes.length];
        for (int i=0 ; i<routes.length ; i++){
            String[] str = routes[i].split(" ");
            bearing[i] = str[0];
            distance[i] = Integer.parseInt(str[1]);
        }
        int maxX; int maxY;

        for(int i=0 ; i<routes.length ; i++){

        }






        int[] answer = {};
        return answer;
    }
}
