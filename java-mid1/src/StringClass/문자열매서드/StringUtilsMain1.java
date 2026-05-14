package StringClass.문자열매서드;
/*
기타 유틸리티
valueOf(Object obj) : 다양한 타입을 문자열로 변환한다.
toCharArray(): 문자열을 문자 배열로 변환한다.
format(String format, Object... args) : 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
matches(String regex) : 문자열이 주어진 정규 표현식과 일치하는지 확인한다
 */
public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 매서드
        System.out.println("int -> String: "+String.valueOf(num));
        System.out.println("boolean -> String: "+String.valueOf(bool));
        System.out.println("Object -> String: "+String.valueOf(obj));
        System.out.println("String -> String: "+String.valueOf(str));
        //빈 문자열로 변환
        String numString2 = ""+num;
        System.out.println(numString2.getClass());
    }
}
