package StringClass.문자열매서드;
/*
toLowerCase() / toUpperCase() : 문자열을 소문자나 대문자로 변환한다.
trim() : 문자열 양쪽 끝의 공백을 제거한다. 단순 Whitespace 만 제거할 수 있다.
strip() : Whitespace 와 유니코드 공백을 포함해서 제거한다. 자바 11
 */
public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "    Java Programing  ";
        System.out.println("소문자로 변환: "+strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: "+strWithSpaces.toUpperCase());

        System.out.println("trim 공백제거: '"+strWithSpaces.trim()+"'");
        System.out.println("strip 공백제거: '"+strWithSpaces.strip()+"'");
        System.out.println("strip 앞 공백제거: '"+strWithSpaces.stripLeading()+"'");
        System.out.println("strip 뒷 공백제거: '"+strWithSpaces.stripTrailing()+"'");

    }
}
