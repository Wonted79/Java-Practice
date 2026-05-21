package enumeration.ref3;

//Enum.name() , Enum.values() 를 활용하여 상수가 추가되었을때 출력값이 동적으로 변할 수 있도록 함.
public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for(Grade grade : grades){
            printDiscount(grade,price);
        }
    }
    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + "등급의 할인 금액: "+grade.discount(price));
    }
}
