package ShoppingMall;

import java.io.*;
import java.util.*;

public class ShoppingMall_Main {
    static String str;
    static List<Product> pro_List = new ArrayList<>();
    static List<Customer> cus_List = new ArrayList<>();
    static List<Order> ord_List = new ArrayList<>();
    static Product product;
    static Customer customer;
    static Order order;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 각각의 버퍼에 텍스트파일을 저장
        BufferedReader brp = new BufferedReader(new FileReader("C:\\Users" +
                "\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Product.txt"));
        BufferedReader brc = new BufferedReader(new FileReader("C:\\Users" +
                "\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Customer.txt"));
        BufferedReader bro = new BufferedReader(new FileReader("C:\\Users" +
                "\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Order.txt"));
        // While 문으로 파일 끝까지 읽어준다.
        while((str = brp.readLine()) != null){
            String[] strings = str.split(" ");
            product = new Product();
            product.setpName(strings[0]);
            product.setpPrice(Integer.parseInt(String.valueOf(strings[1])));
            product.setpStock(Integer.parseInt(String.valueOf(strings[2])));
            pro_List.add(product); // 리스트에 객체를 저장한다.
        }
        while ((str = brc.readLine()) != null){
            String[] strings = str.split(" ");
            customer = new Customer(strings[0], strings[1], strings[2],
                    strings[3], Integer.parseInt(String.valueOf(strings[4])));
            cus_List.add(customer);
        }

        while ((str = bro.readLine()) != null){
            String[] strings = str.split(" ");
            order = new Order(Integer.parseInt(String.valueOf(strings[0])), strings[1],
                    strings[2], Integer.parseInt(String.valueOf(strings[3])));
            ord_List.add(order);
        }
        brp.close(); brc.close(); bro.close();

        //상품, 고객, 주문정보 확인
        /*
        checkCustomer();
        checkProduct();
        checkOrder();
        */

        ShoppingCart cart = new ShoppingCart();
        for (Order a : ord_List) {
            for (Product b : pro_List) {
                for (Customer c : cus_List) {
                    cart.takeOrder1(a, b, c);
                }
            }
        }




        checkProduct();
    }
    //상품객체 전체의 productInfo 메서드를 실행하는 메서드
    public static void checkProduct(){
        for (Product o : pro_List) {
            product = o;
            product.productInfo();
        }
    }
    // 손님객체 전체의 customerInfo 메서드를 실행하는 메서드
    public static void checkCustomer(){
        for (Customer o : cus_List){
            customer = o;
            customer.customerInfo();
        }
    }
    // 주문객체 전체의 orderInfo 메서드를 실행하는 메서드
    public static void checkOrder(){
        for (Order o : ord_List){
            order = o;
            order.orderInfo();
        }
    }
}