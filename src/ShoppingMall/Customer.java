package ShoppingMall;

import java.lang.annotation.Retention;

public class Customer {
    private String cName;
    private String cAddress;
    private String cPNumber;
    private String cEMail;
    public String getcName() { return cName; }
    public void setcName(String cName) { this.cName = cName; }
    public String getcAddress() { return cAddress; }
    public void setcAddress(String cAddress) { this.cAddress = cAddress; }
    public String getcPNumber() { return cPNumber; }
    public void setcPNumber(String cPNumber) { this.cPNumber = cPNumber; }
    public String getcEMail() { return cEMail; }
    public void setcEMail(String cEMail) { this.cEMail = cEMail; }

    Customer(){

    }
    Customer(String cName, String cAddress, String cPNumber, String cEMail){
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPNumber = cPNumber;
        this.cEMail = cEMail;
    }

    public void customerInfo() {
        System.out.println("고객명: "+cName+" 고객주소: "+cAddress+" 전화번호: "+cPNumber+" 이메일: "+cEMail );
    }
}
