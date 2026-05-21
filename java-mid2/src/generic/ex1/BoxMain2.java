package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //Object -> Integer 캐스팅
        System.out.println("integer = "+integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String string = (String) stringBox.get();
        System.out.println("String = "+string);

        //잘못된 타입의 인수 전달
        integerBox.set("안녕");
        //String 타입의 인스턴스를 Object로 업캐스팅해서 가지고있는데
        //Integer로 다운캐스팅할때 왜 문제가 생기는걸까?
        Integer result = (Integer) integerBox.get();
        System.out.println("result = "+result);
    }
}
