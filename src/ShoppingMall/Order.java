package ShoppingMall;

public class Order {
    private int oNum;
    private String oPName;
    private String oCName;
    private int oStock;
    public int getONum() { return oNum; }
    public void setONum(int oNum) { this.oNum = oNum; }
    public String getOPName() { return oPName; }
    public void setOPName(String oPName) { this.oPName = oPName; }
    public String getOCName() { return oCName; }
    public void setOCName(String oCName) { this.oCName = oCName; }
    public int getOStock() { return oStock; }
    public void setOStock(int oStock) { this.oStock = oStock; }
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
