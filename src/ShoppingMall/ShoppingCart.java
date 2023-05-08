package ShoppingMall;

import java.util.Objects;

public class ShoppingCart {

    Order order;
    Product product;
    Customer customer;

    public void takeOrder1(Order order, Product product, Customer customer) {
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
        if(Objects.equals(customerName, orderCName)&&Objects.equals(orderPName, productName)){
            product.setpStock(productStock-orderStock);
            System.out.println("주문번호 "+orderNum+". "+orderCName+"이(가) "+productName+" "
                    +orderStock+" 개를 "+productPrice+"원의 가격으로 "+productPrice*orderStock+"원에 구매하였음.");
        }
    }

}