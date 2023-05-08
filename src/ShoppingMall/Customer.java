package ShoppingMall;

public class Customer {
    private String cName;
    private String cAddress;
    private String cPNumber;
    private String cEMail;
    public String getCName() { return cName; }
    public void setCName(String cName) { this.cName = cName; }
    public String getCAddress() { return cAddress; }
    public void setCAddress(String cAddress) { this.cAddress = cAddress; }
    public String getCPNumber() { return cPNumber; }
    public void setCPNumber(String cPNumber) { this.cPNumber = cPNumber; }
    public String getCEMail() { return cEMail; }
    public void setCEMail(String cEMail) { this.cEMail = cEMail; }
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
