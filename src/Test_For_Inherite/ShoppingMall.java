package Test_For_Inherite;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ShoppingMall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Customer.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stt;
        String str;
        ArrayList<String> customerList = new ArrayList<>();
        while((str = br.readLine()) != null){
            customerList.add(str);
        }
        bw.write(Arrays.toString(new ArrayList[]{customerList}));
        bw.flush();
    }
}

class Product {
    String pName; int pPrice; int pStock;
    public Product(String pName, int pPrice, int pStock) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.pStock = pStock;
    }
}

class Customer {
    String cName; String cAddress; String cPNumber; String cEMail;
    public Customer(String cName, String cAddress, String cPNumber, String cEMail){
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPNumber = cPNumber;
        this.cEMail = cEMail;
    }
}

class Order {
    int oNum; String oPName; String oCName; int oStock; int totalNum;
    public Order(int oNum, String oPName, String oCName, int oStock, int totalNum){
        this.oNum = oNum;
        this.oPName = oPName;
        this.oCName = oCName;
        this.oStock = oStock;
        this.totalNum = totalNum;
    }
}

class ShoppingCart {

}