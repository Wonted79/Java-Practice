package 불변객체.공유참조문제;

import 불변객체.ImmutableAddress;

/*
    불변객체를 도입하여 값 변경시 새로운 객체를 만들어 참조하도록 유도
 */
public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        //b.setValue("부산"); //참조하는 객체의 값을 변경하는 코드 제거
        b= new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
