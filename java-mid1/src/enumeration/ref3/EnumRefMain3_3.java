package enumeration.ref3;

public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;
        int basic = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);
    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + "등급의 할인 금액: "+grade.discount(price));
    }
}
