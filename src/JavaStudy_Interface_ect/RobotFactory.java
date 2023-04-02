package JavaStudy_Interface_ect;

import java.io.*;
import java.util.StringTokenizer;

public class RobotFactory {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
// 첫줄에 case 숫자를 둘째줄부터 "파트명" "가격"을 띄워서 case 숫자만큼 입력받는다.
        int caseNum = Integer.parseInt(br.readLine());
        StringTokenizer stt;
        String[] partName = new String[caseNum];
        int[] partCost = new int[caseNum];
        for(int i=0 ; i<caseNum ; i++){
            stt = new StringTokenizer(br.readLine(), " ");
            partName[i] = stt.nextToken();
            partCost[i] = Integer.parseInt(stt.nextToken());
        }
        for(int i=0 ; i<caseNum ; i++){
            partMethod(partName[i], partCost[i]);
        }
    }
    public static void partMethod(String str, int num) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        RobotPartFactory factory = new RobotPartFactory();
        Part part = factory.createPart(str, num);
        bw.write("부품명 : " + part.getName() + "\n");
        bw.write("부품가격 : " + part.getCost() + "만원\n");
        bw.flush();
    }
}
interface Part {
    String getName();

    int getCost();
}

class RobotPart implements Part{
    private String name; private int cost;

    public RobotPart(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getCost() {
        return cost;
    }
}

class RobotPartFactory {
    public Part createPart(String name, int cost){
        return new RobotPart(name, cost);
    }
}