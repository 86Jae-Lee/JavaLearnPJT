package Test_For_Inherite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShoppingMall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\ShoppingMall_Product.txt"));
        String str;
        while((str = br.readLine()) != null){

        }

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