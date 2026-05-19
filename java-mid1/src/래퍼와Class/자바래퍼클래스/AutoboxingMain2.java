package 래퍼와Class.자바래퍼클래스;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value;
        int unboxedValue = boxedValue;
        System.out.println("boxedValue = "+boxedValue);
        System.out.println("unboxedValue = "+unboxedValue);
    }
}
