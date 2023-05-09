package ShoppingMall;

import java.text.DecimalFormat;
import java.util.Objects;

public class ShoppingCart {

    Order order;
    Product product;
    Customer customer;

    public void takeOrder1(Order order, Product product, Customer customer) {
        DecimalFormat df = new DecimalFormat("###,###");
        this.order = order;
        this.customer = customer;
        this.product = product;
        String customerName = customer.getCName();
        String productName = product.getpName();
        String orderPName = order.getOPName();
        String orderCName = order.getOCName();
        int productPrice = product.getpPrice();
        int productStock = product.getpStock();
        int orderNum = order.getONum();
        int orderStock = order.getOStock();
        int balance = customer.getCBalance();
        int totalNum = productPrice*orderStock;
        if(Objects.equals(customerName, orderCName)&&Objects.equals(orderPName, productName)){
            customer.setCBalance(balance-totalNum);
            balance = customer.getCBalance();
            if(balance>=0){
                System.out.println("주문번호 "+orderNum+". "+orderCName+"이(가) "+productName+
                        " "+orderStock+" 개를 "+df.format(productPrice)+"원의 가격으로 "
                        +df.format((long) productPrice * orderStock)+ "원에 구매하였음.");
                product.setpStock(productStock-orderStock);
            } else {
                System.out.println("주문번호 "+orderNum+"번은 잔액 부족으로 주문에 실패하였습니다.");
                customer.setCBalance(balance+totalNum);
                balance = customer.getCBalance();
            }
            System.out.println(orderCName+"의 현재 잔액 "+df.format(balance)+"원");
        }
    }
}