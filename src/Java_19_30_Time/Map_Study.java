package Java_19_30_Time;

import java.util.Map.*;
import java.util.*;

public class Map_Study {

    public static void main(String[] args) {

        Map<String, String> maps = new HashMap<String, String>();
        maps.put("키값1", "데이터1");
        maps.put("키값2", "데이터2");
        maps.put("키값3", "데이터3");
        maps.put("키값4", "데이터4");
        maps.put("키값5", "데이터5");

        Set keys = maps.keySet();

        keys.forEach(key -> {
            System.out.print(key + "\n");
        });

        for(Entry<String, String> entry : maps.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if(key.equals("키값")) {
                System.out.print("Value");
            }
        }

        maps.entrySet();
        maps.values();
        maps.keySet();


    }
}
