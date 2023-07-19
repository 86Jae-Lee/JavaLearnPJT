package Java_19_30_Time;

import java.util.*;

class Mouse {
    private int footSize;
    private String name;

    Mouse(int footSize, String name){
        this.footSize = footSize;
        this.name = name;
    }

    public String getData() {
        return String.valueOf(footSize) + " : " + this.name;
    }
}

class Coffee{
    private float liter;
    private int price;
    public String name;

    Coffee(float liter, int price, String name){
        this.liter = liter;
        this.price = price;
        this.name = name;
    }
}

public class List_Study2 {
    public static void main(String[] args) {
        // Re-Sizable array : 크기가 유동적으로 변경될 수 있는 배열
        List list = new ArrayList(100);

        list.add(new Mouse(10, "쥐 1"));
        list.add(new Mouse(12, "쥐 3"));
        list.add(new Mouse(11, "쥐 2"));

        for (int i=0 ; i<list.size() ; i++){
            System.out.print(((Mouse)list.get(i)).getData() + "\n");
        }

        List<Coffee> coffeeList = Arrays.asList(
                new Coffee(201, 13, "아메리카노"),
                new Coffee(201, 10, "카푸치노"),
                new Coffee(201, 11, "카페라떼")
        );

        Collections.sort(coffeeList, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        for (int i=0 ; i<coffeeList.size() ; i++){
            System.out.print(String.valueOf(((Coffee)coffeeList.get(i)).name)+"\n");
        }

    }
}
