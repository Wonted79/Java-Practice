package 래퍼와Class.자바래퍼클래스;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value =127;
        Integer boxedValue = Integer.valueOf(value);
        Integer generalValue = 127;
        System.out.println(System.identityHashCode(boxedValue));
        System.out.println(System.identityHashCode(generalValue));

        int unboxedValue = boxedValue.intValue();
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
