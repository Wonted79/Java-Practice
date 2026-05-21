package generic.ex1;

//제네릭은 타입 안정성 , 코드 재사용성을 위해 사용한다.
public class BoxMain3 {
    public static void main(String[] args) {
        //생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);
        //integerBox.set("문자100"); //Integer 타입만 허용하도록 미리 선언 , 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = "+integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String string = stringBox.get();
        System.out.println("string = "+string);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double doubleValue = doubleBox.get();
        System.out.println("double = "+doubleValue);
    }
}
