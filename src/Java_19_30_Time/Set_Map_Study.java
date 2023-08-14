package Java_19_30_Time;

import java.util.*;

public class Set_Map_Study {

    public static void main(String[] args) {

        //HashSet, LinkedHashSet 둘 다 중복은 없앤다.
        Set<String> setData1 = new HashSet<>();
        setData1.add("1가나다");
        setData1.add("2라마바");
        setData1.add("3사아자");
        setData1.add("4차카타");
        setData1.add("5파하아");

        for(String s : setData1){
            System.out.print(s + "\n");
        }

        System.out.println();

        Set<String> setData2 = new LinkedHashSet<>();
        setData2.add("1가나다");
        setData2.add("2라마바");
        setData2.add("3사아자");
        setData2.add("4차카타");
        setData2.add("5파하아");

        for(String s : setData2){
            System.out.print(s + "\n");
        }

        Map<String, String> maps = new HashMap<String, String>();
        maps.put("키값1", "데이터1");
        maps.put("키값2", "데이터2");
        maps.put("키값3", "데이터3");
        maps.put("키값4", "데이터4");
        maps.put("키값5", "데이터5");

        Set keys = maps.keySet();

    }
}
