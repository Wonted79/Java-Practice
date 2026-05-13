package 불변객체.불변객체도입;

import 불변객체.Address;

public class MemberV1 {
    private String name;
    private Address address;

    MemberV1(String name,Address address){
       this.name = name;
       this.address = address;
    }

    String getName(){
        return name;
    }

    Address getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ",address="+address.toString()+'}';
    }
}
