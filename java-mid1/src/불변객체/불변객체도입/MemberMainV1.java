package 불변객체.불변객체도입;

import 불변객체.Address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("회원A",address);
        MemberV1 memberB = new MemberV1("회원B",address);

        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);

        memberB.getAddress().setValue("대구");
        System.out.println("대구 -> memberB.address");
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);
    }
}
