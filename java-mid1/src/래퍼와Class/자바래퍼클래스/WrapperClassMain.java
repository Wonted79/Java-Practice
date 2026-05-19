package 래퍼와Class.자바래퍼클래스;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = "+integerObj);
        System.out.println("longObj = "+longObj);
        System.out.println("doubleObj = "+doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = "+intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = "+longValue);

        System.out.println("비교");
        System.out.println("elquals: "+integerObj.equals(intValue));
    }
}
