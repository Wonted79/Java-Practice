package StringClass.문자열비교;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println("new String() == 비교:"+(str1==str2));
        System.out.println("new String() equals 비교"+(str1.equals(str2)));

        //메모리 효율 성능 최적화를 위해 문자열 풀 사용
        //문자열 리터럴을 읽어 같은 문자열 풀의 인스턴스를 바라볼 수 있도록 함.
        //이전에 new 로 생성한 "hello"와 연결되지 않는듯함.
        String str3 = "hello";
        String str4 = "hello";
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println("new String() == 비교:"+(str3==str4));
        System.out.println("new String() equals 비교"+(str3.equals(str4)));
    }
}
