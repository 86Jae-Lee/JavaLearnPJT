package JavaGrammar;

import java.io.*;

public class Grammar_ReadFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        FileReader reader = new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\Java_FirstRead.txt");
        int ch;
        while ((ch = reader.read()) != -1 ){
            System.out.print((char) ch); //read() 메소드는 stream의 끝에서 -1을 리턴.
        }
        reader.close();
        bw.write("\n");
        bw.flush();

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\Java_FirstRead.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str); //한줄씩 읽으며 내용이 없으면 null 반환
        }
        br.close();
    }

}
