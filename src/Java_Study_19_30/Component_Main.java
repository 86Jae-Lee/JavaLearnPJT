package Java_Study_19_30;

import java.util.*;

interface computerInterface {
    private String powerOn() {
        return null;
    }
}

class Harddisk {
    private int size;
    private String brand;
    private int diskCount;

    Harddisk(){

    }

    Harddisk(String brand) {
        this.brand = brand;
    }

    Harddisk(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    Harddisk(int size, String brand, int diskCount){
        this.size = size;
        this.brand = brand;
        this.diskCount = diskCount;
    }

    public void diskInfo() {
        System.out.print("Disk : "+this.size+", Brand : "+this.brand);
    }
}

class computer implements computerInterface {
    private boolean isPowerOn;
    private int screenWidth;
    private int screenHight;
    private String language;

    computer() {
        this.screenHight = 0;
        this.screenWidth = 0;
    }

    public boolean isForeign() {
        boolean flag = false;

        String[] foreignLanguage = {"EN", "FR", "CN"};
        for(int i=0 ; i<= foreignLanguage.length ; i++){
            if(foreignLanguage[i] == this.language){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean isMobile() {
        if(this.screenWidth < 500 && this.screenHight < 500) {
            return true;
        }
        return false;
    }

    private void powerOn() {
        System.out.println("컴퓨터의 전원이 켜졌습니다.");
    }
}

public class Component_Main {

    public static void main(String[] args) {

        HashMap Harddisks = new HashMap<String, Harddisk>();

        Harddisk harddisk = new Harddisk(100, "Samsung");

        Harddisks.put("MyHarddisk", harddisk);

        Harddisk myHard = (Harddisk) Harddisks.get("MyHarddisk");

        myHard.diskInfo();
    }
}
