package StringClass.문자열불변;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = "+str);

        //concat은 기존의 값을 변경하지 않고 새로운 결과를 만들어서 반환
    }
}
