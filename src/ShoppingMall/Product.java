package ShoppingMall;

public class Product {
    private String pName;
    private int pPrice;
    private int pStock;
    public String getpName() {
        return pName;
    }
    public void setpName(String pName){
        this.pName = pName;
    }
    public int getpPrice() {
        return pPrice;
    }
    public void setpPrice(int pPrice){
        this.pPrice = pPrice;
    }
    public int getpStock() {
        return pStock;
    }
    public void setpStock(int pStock){
        this.pStock = pStock;
    }
    Product(){}
    Product(String pName, int pPrice, int pStock) {
        this.pName = pName;
        this.pPrice = pPrice;
        this.pStock = pStock;
    }

    public void productInfo(){
        System.out.println("제품명: "+pName+" 제품가격: "+pPrice+
                " 재고: "+pStock);
    }
}