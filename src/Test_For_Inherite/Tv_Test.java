package Test_For_Inherite;

public class Tv_Test {

    public static void main(String[] args) {
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}

class TV {
    private int size;
    public TV(int size) {this.size = size;}
    protected int getSize() {return size;}
}

class ColorTV extends TV {

    private int resolution;
    public ColorTV(int size, int resolution) {
        super(size);
        this.resolution = resolution;
    }

    protected int getResolution() {return resolution;}

    public void printProperty(){
        System.out.println(getSize()+"인치 "+resolution+"컬러");
    }
}
class IPTV extends ColorTV{
    private String address;
    public IPTV(String address, int size, int resolution) {
        super(size, resolution);
        this.address = address;
    }

    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 "+address+" 주소의 "+getSize()+"인치 "+getResolution()+"컬러");
    }
}