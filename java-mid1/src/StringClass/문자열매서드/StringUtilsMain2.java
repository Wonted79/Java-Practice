package StringClass.문자열매서드;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format
        String format1 = String.format("num: %d bool: %b str: %s",num,bool,str);
        System.out.println(format1);

        String format2 = String.format("소수 2째자리까지: %.2f",10.1234);
        System.out.println(format2);

        //printf
        System.out.printf("소수 2째자리 printf: %.2f",10.1234);

        //matches 매서드
        String regex = "Hello, (Java!|World)";
        System.out.println("str의 패턴이 일치하는가? "+str.matches(regex));
    }
}
