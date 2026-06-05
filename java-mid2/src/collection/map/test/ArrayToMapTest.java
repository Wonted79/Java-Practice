package collection.map.test;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SimpleTimeZone;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};
        //Map 생성
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<productArr.length;i++){
            map.put(productArr[i][0],Integer.valueOf(productArr[i][1]));
        }
        //Map의 모든 데이터 출력
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String,Integer>entry:entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("제품: "+key+", 가격: "+value);
        }
    }
}
