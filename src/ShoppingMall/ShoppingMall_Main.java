package ShoppingMall;

import java.io.*;
import java.util.*;
import java.util.List;

public class ShoppingMall_Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader brp = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Product.txt"));
        String str;
        List<Product> pro_List = new ArrayList<Product>();
        Product product;
        while((str = brp.readLine()) != null){
            String[] strings = str.split(" ");
            product = new Product();
            product.setpName(strings[0]);
            product.setpPrice(Integer.parseInt(String.valueOf(strings[1])));
            product.setpStock(Integer.parseInt(String.valueOf(strings[2])));
            pro_List.add(product);
        }
        for (Product o : pro_List) {
            product = o;
            product.productInfo();
        }
        brp.close();
        BufferedReader brc = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Customer.txt"));
        Customer customer;
        List<Customer> cus_List = new ArrayList<>();
        while ((str = brc.readLine()) != null){
            String[] strings = str.split(" ");
            customer = new Customer(strings[0], strings[1], strings[2], strings[3]);
            cus_List.add(customer);
        }
        for (Customer o : cus_List){
            customer = o;
            customer.customerInfo();
        }
        brc.close();
        BufferedReader bro = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\Study\\Coding\\JavaStudy\\readFile\\ShoppingMall_Order.txt"));
        Order order;
        List<Order> ord_List = new ArrayList<Order>();
        while ((str = bro.readLine()) != null){
            String[] strings = str.split(" ");
            order = new Order(Integer.parseInt(String.valueOf(strings[0])), strings[1], strings[2], Integer.parseInt(String.valueOf(strings[3])));
            ord_List.add(order);
        }
        for (Order o : ord_List){
            order = o;
            order.orderInfo();
        }
        bro.close();



    }
}