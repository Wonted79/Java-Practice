package collection.map.test.member;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }
    public void remove(String id) {
        memberMap.remove(id);
    } public Member findById(String id) {
        return memberMap.get(id);
    }
    public Member findByName(String name) {
        for (Member member : memberMap.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    /*
    private Map<String,String> members = new HashMap<>();

    public MemberRepository (){

    }

    public void save(Member member){
        members.put(member.getId(),member.getName());
        System.out.println(members);
    }

    public void remove(String id){
        if(members.containsKey(id)){
            members.remove(id);
        }
    }

    public Member findById(String id){
        //System.out.println(members.containsKey(id));
        if(members.containsKey(id)){
            return new Member(id,members.get(id));
        }
        return null;
    }
    public Member findByName(String name){
        for(String memberId: members.keySet()){
            if(members.get(memberId).equals(name)){
                return new Member(memberId,name);
            }
        }
        return null;
    }

     */
}
