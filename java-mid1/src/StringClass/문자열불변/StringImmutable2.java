package StringClass.문자열불변;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String temp = "hello java";
        System.out.println(System.identityHashCode(temp));
        //concat을 사용하면 새로운 String 객체를 반환, 그리고 바로 println 에 의해 toString()이 자동으로 호출됨
        System.out.println(str1.concat(" java").toUpperCase());
        String str2 = str1.concat(" java");
        //이때 concat에 의해 반환된 String 객체는 문자열 풀이 아닌 new 로 생성된 객체일 것이다.
        System.out.println(System.identityHashCode(str2));
        System.out.println("str 1 ="+str1);
        System.out.println("str 2 ="+str2);
    }
}
