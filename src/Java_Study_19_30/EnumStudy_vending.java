package Java_Study_19_30;

import java.util.*;

enum ProductType {
    Water, Food, Cup
}

class Product {
    //상품 이름
    private String name;
    //상품 가격
    private int price;
    //할인 가격
    private int sale;
    //섭취 칼로리
    private int calorie;
    //상품 유형
    private ProductType type;

    Product(String name, int price, int sale, int calorie, ProductType type){
        this.name = name;
        this.price = price;
        this.sale = sale;
        this.calorie = calorie;
        this.type = type;
    }

    public int getPrice() {
        return this.price;
    }
}

class VendingMachine {
    //선택한 상품들
    private List<Product> products = new ArrayList<>();

    //자판기에 투입한 금액
    private int totalPayments = 0;

    VendingMachine() {

    }

    //자판기에 상품을 추가한다
    public void addProducts(Product product) {
        this.products.add(product);
    }

    //자판기의 상품을 초기화한다.
    public void clearProducts(Product product) {
        this.products.clear();
    }

    //자판기의 특정자리의 상품을 없앤다.
    public void removeProducts(int index) {
        this.products.remove(index);
    }

    //자판기의 이미 알고 있는 상품을 없앤다.
    public void removeProducts(Product product) {
        this.products.remove(product);
    }

    //자판기에서 선택한 상품들의 가격들의 합을 가져온다.
    public int getTotalPrice() {
        int total = 0;
        for(int i=0 ; i<=this.products.size() ; i++){
            total += this.products.get(i).getPrice();
        }
        return total;
    }

    //투입한 금액을 설정한다.
    public void setPaymentPrice(int payments) {
        this.totalPayments = payments;
    }

    //돌려줄 금액을 설정한다.
    public int getReceiveMoney() {
        return this.totalPayments - this.getTotalPrice();
    }
}

public class EnumStudy_vending {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        //생수 상품
        Product water = new Product("생수", 1500, 0, 500, ProductType.Water);

        //자판기에 생수상품 추가
        vendingMachine.addProducts(water);

        vendingMachine.setPaymentPrice(2000);


    }
}

