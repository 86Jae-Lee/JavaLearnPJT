package JavaStudy_Interface_ect;

import java.util.Scanner;

public class Employee_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SalariedEmployee se1 = new SalariedEmployee("Kim", "서울", 2, 40);
        se1.gSalary(3400);
        HourlyEmployee he1 = new HourlyEmployee("이", "울산", 2, 52, str);
        he1.gSalary(13000);
    }

}
class Employee {
    String name; String address;
    int yearWork; int workHour;
    public Employee(String name, String address, int yearWork, int workHour){
        this.name = name;
        this.address = address;
        this.yearWork = yearWork;
        this.workHour = workHour;
    }

    public void gSalary(int num){
    }
}

class SalariedEmployee extends Employee {
    int salary;
    public SalariedEmployee(String name, String address, int yearWork, int workHour) {
        super(name, address, yearWork, workHour);
    }

    @Override
    public void gSalary(int salary) {
        System.out.println(name+"의 연봉은 "+salary+"만원 입니다.");
    }
}
class HourlyEmployee extends Employee {double weaklySalary;
    String wTime;
    public HourlyEmployee(String name, String address, int yearWork, int workHour, String wTime) {
        super(name, address, yearWork, workHour);
        this.wTime = wTime;
    }
    int intWeaklySalary;
    @Override
    public void gSalary(int hWage) {
        if(wTime.equals("day")||wTime.equals("Day")){
            if(workHour==40){
                weaklySalary = hWage*40;
            } else{
                weaklySalary = ((workHour-40)*hWage*1.5)+hWage*40;
            }
        } else {
            if(workHour==40){
                weaklySalary = hWage*40*1.5;
            } else{
                weaklySalary = (((workHour-40)*hWage*1.5)+hWage*40)*1.5;
            }
        }
        intWeaklySalary = (int)weaklySalary;
        System.out.println(name+"의 주급은 "+intWeaklySalary+"원 입니다.");
    }
}