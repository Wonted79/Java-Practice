package object.object_toString;

public class Dog {
    private String dogName;
    private int age;
    public Dog(String dogName , int age){
        this.dogName = dogName;
        this.age = age;
    }

    public String toString(){
        //참조값 출력
        String refValue = Integer.toHexString(System.identityHashCode(this));
        return "Dog{" + "dogName='"+dogName + '\'' +", age=" + age + ", refValue="+refValue +'}';
    }
}
