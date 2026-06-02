package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3"); //문자 입력
        System.out.println(numberList);

        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);
        //클래스 캐스팅 오류 발생 -> 타입 불안정
        Integer num3 = (Integer) numberList.get(2);
    }
}
