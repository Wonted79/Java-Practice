package 래퍼와Class.Class클래스;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Class.forName("래퍼와Class.Class클래스.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = "+result);
    }
}
