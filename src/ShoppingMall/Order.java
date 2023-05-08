package ShoppingMall;

import java.awt.*;

public class Order {
    private int oNum;
    private String oPName;
    private String oCName;
    private int oStock;
    private int totalNum;
    public int getoNum() { return oNum; }
    public void setoNum(int oNum) { this.oNum = oNum; }
    public String getoPName() { return oPName; }
    public void setoPName(String oPName) { this.oPName = oPName; }
    public String getoCName() { return oCName; }
    public void setoCName(String oCName) { this.oCName = oCName; }
    public int getoStock() { return oStock; }
    public void setoStock(int oStock) { this.oStock = oStock; }
    Order() {

    }
    Order(int oNum, String oPName, String oCName, int oStock){
        this.oNum = oNum;
        this.oPName = oPName;
        this.oCName = oCName;
        this.oStock = oStock;
    }

    public void orderInfo() {
        System.out.println("주문번호: "+oNum+" 주문상품: "+oPName+" 주문자: "+oCName+" 주문수량: "+oStock);
    }
}
