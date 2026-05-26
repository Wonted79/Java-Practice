package generic.ex1;

public class RawTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        integerBox.set(10);
        //제네릭의 장점인 타입 안정성이 사라짐
        Integer result = (Integer) integerBox.get();
        System.out.println("result = "+result);
    }
}
