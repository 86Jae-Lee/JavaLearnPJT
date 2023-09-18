package Theater_Program;

public class Customer{

    private String customer;
    private String phoneNum;

    public Customer(String customer, String phoneNum) {
        this.customer = customer;
        this.phoneNum = phoneNum;
    }

    // 사용자 정보 반환
    public String getCustomer() {
        return customer;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    // 사용자 정보 설정
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "고객 [고객명 : " + customer + ", 전화번호 : " + phoneNum + "]";
    }
}
