package 불변객체.공유참조문제;

import 불변객체.Address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("대구");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }
}

