package StringClass.문자열매서드;
/*
문자열 비교
equals(Object anObject) : 두 문자열이 동일한지 비교한다.
equalsIgnoreCase(String anotherString) : 두 문자열을 대소문자 구분 없이 비교한다.
compareTo(String anotherString) : 두 문자열을 사전 순으로 비교하여 a가 b보다 아스키코드가 앞서면 음수 아니면 양수
compareToIgnoreCase(String str) : 두 문자열을 대소문자 구분 없이 사전적으로 비교한다.
startsWith(String prefix) : 문자열이 특정 접두사로 시작하는지 확인한다.
endsWith(String suffix) : 문자열이 특정 접미사로 끝나는지 확인한다.
 */
public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = "Hello, Java";
        String str3 = "Hello, World";

        //equals
        System.out.println("{equals(Object anObject)}");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        //equalsIgnoreCase(String anotherString)
        System.out.println("{equalsIgnoreCase(String anotherString)}");
        System.out.println(str1.toUpperCase().equalsIgnoreCase(str2.toLowerCase()));
        System.out.println(str1.equalsIgnoreCase(str3));

        //compareTo(String anotherString) ??
        System.out.println("{compareTo(String anotherString)}");
        System.out.println(str1.compareTo(str2));
        System.out.println(str3.compareTo(str1));

        //compareToIgnoreCase(String str)
        String cti1 = "Hello, java";
        String cti2 = "Hello, World";
        System.out.println("{compareToIgnoreCase(String str)}");
        System.out.println(cti1.compareToIgnoreCase(cti2));
        System.out.println(cti2.compareToIgnoreCase(cti1));

        //startsWith(String prefix)
        String pub1= "/pub/string";
        System.out.println("{startsWith(String prefix)}");
        System.out.println(pub1.startsWith("/pub"));
        System.out.println(pub1.startsWith("/sub"));

        //endsWith(String suffix)
        String pub2= "/pub/string";
        System.out.println("{endsWith(String suffix)}");
        System.out.println(pub2.endsWith("/string"));
        System.out.println(pub2.endsWith("/pub"));
    }
}
