package StringClass.문자열매서드;
/*
자주사용하는 String Method
 */
public class StringMethodMain {
    public static void main(String[] args) {

        //문자열의 길이 반환
        String str1 = "hello";
        System.out.println(str1.length());
        //문자열 양 끝의 공백을 제거
        String str3 = " hi ";
        System.out.println(str3.trim());
        //대문자 소문자 변경
        String str2 = "Lee";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        //특정 인덱스의 문자를 반환
        System.out.println(str2.charAt(0));
        //특정 문자열이 시작되는 인덱스 반환
        System.out.println(str1.indexOf("l"));

        //문자열의 부분 문자열을 반환 , 파이썬의 슬라이싱
        System.out.println(str1.substring(1,3));

    }
}
