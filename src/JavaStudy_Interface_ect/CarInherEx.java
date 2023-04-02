package JavaStudy_Interface_ect;

public class CarInherEx {
    public static void main(String[] args) {
        Car stinger = new Car();
        stinger.gasGauge(44);
        stinger.showCurrentGauge();
        HybridCar Hyundai = new HybridCar();
        Hyundai.electGauge(55, 100);
        Hyundai.showCurrentElectGauge();
    }
}

class Car {
    int gasGauge;
    public void gasGauge(int gasGauge){
        this.gasGauge = gasGauge;
    }
    public void showCurrentGauge() {
        System.out.println("잔여 가솔린 : " + gasGauge);
    }
}

class HybridCar extends Car {
    int electGauge;
    public void electGauge(int gasGauge, int electGauge){
        super.gasGauge = gasGauge;
        this.electGauge = electGauge;
    }
    public void showCurrentElectGauge(){
        showCurrentGauge();
        System.out.println("잔여 전기량 : " + electGauge);
    }
}