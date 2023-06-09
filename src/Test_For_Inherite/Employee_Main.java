package Test_For_Inherite;

import java.text.DecimalFormat;

public class Employee_Main {
    public static void main(String[] args) {
        EmployeeManager.se1.salaryAnnounce();
        EmployeeManager.se1.checkPersonalInfo();
        EmployeeManager.he1.salaryAnnounce();
        EmployeeManager.he1.checkPersonalInfo();
        EmployeeManager.sa1.salaryAnnounce();
        EmployeeManager.sa1.checkPersonalInfo();
    }
}

class EmployeeManager {
    static SalariedEmployee se1 = new SalariedEmployee("Kim Jin-Woo", "울산","010-1234-5678",
            "22-04-01", 40, 300);
    static HourlyEmployee he1 = new HourlyEmployee("Lee Jun-Ho", "부산","010-2345-6666",
            "21-01-01", 52, 21000, "Day");
    static SalesEmployee sa1 = new SalesEmployee("Kim Dong-il", "서울", "010-3939-3939",
            "22-01-01", 40, 220, 1.5, 30000, 2000);

}

class Employee {
    String name; String address; String phoneNum; String joinComDate;
    int workHour;
    public  Employee (String name, String address, String phoneNum, String joinComDate, int workHour) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.joinComDate = joinComDate;
        this. workHour = workHour;
    }
    public int salaryCount(){
        return 0;
    }
    public void salaryAnnounce(){
    }
    public void checkPersonalInfo(){
        System.out.println("이름: "+name+" 주소: "+address+" 전화번호: "+phoneNum
        +" 입사일: "+joinComDate+" 주간 근로시간: "+workHour);
    }
}
class SalariedEmployee extends Employee{
    DecimalFormat df = new DecimalFormat("###,###");
    int monthlySalary;
    public SalariedEmployee(String name, String address, String phoneNum,
                            String joinComDate, int workHour, int monthlySalary) {
        super(name, address, phoneNum, joinComDate, workHour);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int salaryCount() {
        return monthlySalary*12;
    }

    @Override
    public void salaryAnnounce() {
        String yearlySalary = df.format(salaryCount());
        System.out.println(name+"의 연봉은 "+yearlySalary+"만원 입니다.");
    }

    @Override
    public void checkPersonalInfo() {
        super.checkPersonalInfo();
        System.out.println("연봉제");
    }
}

class HourlyEmployee extends Employee {
    int hWage; double weaklySalary; String wTime;
    DecimalFormat df = new DecimalFormat("###,###");
    public HourlyEmployee(String name, String address, String phoneNum, String joinComDate,
                          int workHour, int hWage, String wTime) {
        super(name, address, phoneNum, joinComDate, workHour);
        this.hWage = hWage;
        this.wTime = wTime;
    }

    @Override
    public int salaryCount() {

        int sl;
        if(wTime.equals("day")&&wTime.equals("Day")){
            if (workHour == 40){
                weaklySalary = hWage*40;
            } else {
                weaklySalary = hWage*40 + ((workHour-40)*hWage*1.5);
            }
        } else {
            if (workHour == 40) {
                weaklySalary = hWage*40*1.5;
            } else {
                weaklySalary = (hWage*40 + ((workHour-40)*hWage*1.5)*1.5);
            }
        }
        sl = (int)weaklySalary;
        return sl;
    }

    @Override
    public void salaryAnnounce() {
        int wage = salaryCount();
        String money = df.format(wage);
        System.out.println(name+"의 주급은 "+money+"원 입니다.");
    }

    @Override
    public void checkPersonalInfo() {
        super.checkPersonalInfo();
        String hourWage = df.format(hWage);
        System.out.println("시급제(시급 "+hourWage+"원)");
    }
}

class SalesEmployee extends Employee {
    int monthlySalary; double sAllowance; int sVolume; int uPrice;
    public SalesEmployee(String name, String address, String phoneNum, String joinComDate, int workHour, int monthlySalary
    , double sAllowance, int sVolume, int uPrice) {
        super(name, address, phoneNum, joinComDate, workHour);
        this.monthlySalary = monthlySalary;
        this.sAllowance = sAllowance;
        this.sVolume = sVolume;
        this.uPrice = uPrice;
    }
    @Override
    public int salaryCount() {
        double salary = ((monthlySalary * 10000) + (sVolume*uPrice) * sAllowance / 100) / 10000;
        return (int)salary;
    }

    @Override
    public void salaryAnnounce() {
        System.out.println(name+"의 월급은 "+salaryCount()+"만원 입니다.");
    }

    @Override
    public void checkPersonalInfo() {
        super.checkPersonalInfo();
        System.out.println("인센티브제");
    }
}