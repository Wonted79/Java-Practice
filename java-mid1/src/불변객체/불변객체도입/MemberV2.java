package 불변객체.불변객체도입;

import 불변객체.ImmutableAddress;

public class MemberV2 {
    private final String name;
    private ImmutableAddress address;

    MemberV2(String name,ImmutableAddress address){
       this.name = name;
       this.address = address;
    }

    public String getName(){
        return name;
    }
    public ImmutableAddress getAddress(){
        return address;
    }
    public void setAddress(ImmutableAddress address){
        this.address = address;
    }

    public String toString(){
        return "MemberV2{"+"name='"+name+"',address="+address+'}';
    }


}
