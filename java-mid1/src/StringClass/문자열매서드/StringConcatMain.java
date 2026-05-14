package StringClass.문자열매서드;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";

        //String은 참조형이라 +연산이 없지만 자주사용해서 기능이 있다.
        System.out.println(a+b);
        //원래 사용하는 함수
        System.out.println(a.concat(b));
        System.out.println(a);

    }
}
