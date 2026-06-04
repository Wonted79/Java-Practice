package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1{
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};
        Set<Integer> set = new HashSet<>();
        for(Integer input : inputArr){
            set.add(input);
        }
        /*
        for (Integer s: set){
            System.out.println(s);
        }
         */
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {  //다음 데이터가 있는지 확인
            System.out.println(iterator.next() + " ");  //다음 데이터 반환
        }
    }
}
