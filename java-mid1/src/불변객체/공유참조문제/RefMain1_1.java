package 불변객체.공유참조문제;

import 불변객체.Address;

public class RefMain1_1 {
    //참조형 타입은 자신의 값의 위치를 공유하여 접근이 가능하다.
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
}
