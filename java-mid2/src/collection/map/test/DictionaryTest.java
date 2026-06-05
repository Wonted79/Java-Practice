package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> engDictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        //영어단어 한글단어 사전에 저장
        String eng="",kor;
        System.out.println("==단어 입력 단계==");
        //q가 입력되면 반복문 안타기 eng=q면 종료
        //반복문은 참일동안만 사용  !eng=q 반복
        while(true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'):");
            eng = scanner.next();
            if(eng.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요:");
            kor = scanner.next();
            engDictionary.put(eng,kor);
        }
        //단어 검색시 영어->한글
        System.out.println("==단어 검색 단계");
        while(true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'):");
            eng = scanner.next();
            if(eng.equals("q")){
                break;
            }
            //자주타는 흐름을 위에두자
            if(engDictionary.containsKey(eng)){
                kor = engDictionary.get(eng);
                System.out.println(eng+"의 뜻: "+engDictionary.get(eng));
            }
            else System.out.println(eng+"은(는) 사전에 없는 단어입니다.");
        }
    }
}
