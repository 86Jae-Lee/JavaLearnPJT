package ShoppingMall_sc;
import java.util.*;
public class Customer {
    private String name;
    private String address;
    private String phone;
    private String eMail;
    private int Balance;

    public Customer(String name, String address, String phone, String eMail, int Balance) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.Balance = Balance;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEMail() {
        return eMail;
    }
    public int getBalance() {
        return Balance;
    }
    public void addOrder(Order order) {
        // 주문은 데이터베이스에 저장됩니다.
    }
    public void removeOrder(Order order) {
        // 주문은 데이터베이스에서 삭제됩니다.
    }
    public void customerInfo() {
        System.out.println("고객명: "+name+" 고객주소: "+address+" 전화번호: "+phone+
                " 이메일: "+eMail+" 보유금액: "+Balance);
    }
}
