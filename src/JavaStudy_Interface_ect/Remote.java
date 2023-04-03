package JavaStudy_Interface_ect;

public class Remote {
    public static void main(String[] args) {
        RemoteControl rControl = new Television();
        rControl.turnOn();
        rControl.setVolume(15);
        rControl.setVolume(-100);
        rControl.turnOff();

        System.out.println();

        rControl = new Audio();
        rControl.turnOn();;
        rControl.setVolume(15);
        rControl.setVolume(-15);
        rControl.turnOff();
    }

}

interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}

class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        //볼륨이 0~10사이에서만 움직이는 것으로 프로그래밍함.
        if (volume>RemoteControl.MAX_VOLUME){
            System.out.println("Audio 볼륨의 최대값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME){
            System.out.println("Audio 볼륨의 최소값은 0입니다.");
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}

class Television implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        //볼륨이 0~10사이에서만 움직이는 것으로 프로그래밍함.
        if (volume>RemoteControl.MAX_VOLUME){
            System.out.println("TV 볼륨의 최대값은 10입니다.");
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME){
            System.out.println("TV 볼륨의 최소값은 0입니다.");
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + this.volume);
    }
}