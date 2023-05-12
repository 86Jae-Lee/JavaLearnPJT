package ShoppingMall_sc;

import java.text.DecimalFormat;
import java.util.List;

public class Order extends Customer {
    private List<Product> products;

    public Order(String name, String address, String phone, String eMail, int Balance) {
        super(name, address, phone, eMail, Balance);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getPhone() {
        return super.getPhone();
    }

    @Override
    public String getEMail() {
        return super.getEMail();
    }

    @Override
    public int getBalance() {
        return super.getBalance();
    }

    @Override
    public List<Order> getOrders() {
        return super.getOrders();
    }

    @Override
    public void addOrder(Order order) {
        super.addOrder(order);
    }

    @Override
    public void removeOrder(Order order) {
        super.removeOrder(order);
    }

    @Override
    public void customerInfo() {
        super.customerInfo();
    }

    public void orderInfo() {
        System.out.println("주문번호: "+oNum+" 주문상품: "+oPName+" 주문자: "
                +oCName+" 주문수량: "+df.format(oStock));
    }
}