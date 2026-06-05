package collection.map.test;

import java.awt.image.ImageProducer;
import java.util.*;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");
        Map<String,Integer> fruits = new HashMap<>();
        //키가 있는지 확인하고 있으면 해당 값에 추가 ,없으면 새로운 값 추가
        /*
        for (String word : words){
            if(fruits.containsKey(word)){
                fruits.put(word,fruits.get(word)+1);
                continue;
            }
            fruits.put(word,1);
        }
         */
        /*
        //Null로 해당 key가 있는지 확인
        for (String word :words){
            Integer count = fruits.get(word);
            if (fruits.get(word) ==null){
                count=0;
            }
            count++;
            fruits.put(word,count);
        }

         */
        //없으면 0으로 기본값 지정하겠습니다. 있으면 word 의 value를 가져와 1을 더합니다.
        for (String word : words) {
            fruits.put(word, fruits.getOrDefault(word, 0) + 1);
        }
        System.out.println(fruits);
    }
}
