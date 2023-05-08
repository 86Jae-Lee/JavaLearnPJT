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
        BufferedReader brp = new BufferedReader(new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\ShoppingMall_Product.txt"));
        BufferedReader brc = new BufferedReader(new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\ShoppingMall_Customer.txt"));
        BufferedReader bro = new BufferedReader(new FileReader("C:\\Users\\riosp\\Desktop\\JavaLearnPJT\\readFile\\ShoppingMall_Order.txt"));

        while((str = brp.readLine()) != null){
            String[] strings = str.split(" ");
            product = new Product();
            product.setpName(strings[0]);
            product.setpPrice(Integer.parseInt(String.valueOf(strings[1])));
            product.setpStock(Integer.parseInt(String.valueOf(strings[2])));
            pro_List.add(product);
        }

        while ((str = brc.readLine()) != null){
            String[] strings = str.split(" ");
            customer = new Customer(strings[0], strings[1], strings[2], strings[3]);
            cus_List.add(customer);
        }

        while ((str = bro.readLine()) != null){
            String[] strings = str.split(" ");
            order = new Order(Integer.parseInt(String.valueOf(strings[0])), strings[1], strings[2], Integer.parseInt(String.valueOf(strings[3])));
            ord_List.add(order);
        }
        brp.close(); brc.close(); bro.close();
        checkProduct();
        checkCustomer();
        checkOrder();
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
    public static void checkProduct(){
        for (Product o : pro_List) {
            product = o;
            product.productInfo();
        }
    }
    public static void checkCustomer(){
        for (Customer o : cus_List){
            customer = o;
            customer.customerInfo();
        }
    }
    public static void checkOrder(){
        for (Order o : ord_List){
            order = o;
            order.orderInfo();
        }
    }
}