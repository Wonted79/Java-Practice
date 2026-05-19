package 래퍼와Class.자바래퍼클래스;

import java.util.Scanner;
//Integer 타입과 int 타입 자유롭게 변환
public class WrapperUtilsMain {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf("10");
        int i3 = Integer.parseInt("10");
        int i4 = 7;
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
        System.out.println(System.identityHashCode(i3));

        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = "+compareResult);

        System.out.println("sum = "+Integer.sum(i1,i3));
        System.out.println("max = "+Integer.max(i3,i4));
        System.out.println("min = "+Integer.min(i3,i4));
    }
}
