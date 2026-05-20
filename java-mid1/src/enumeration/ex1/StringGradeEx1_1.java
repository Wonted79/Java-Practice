package enumeration.ex1;

import enumeration.ex0.DiscountService;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex0.DiscountService discountService = new DiscountService();
        int basicPrice = discountService.discount(StringGrade.BASIC,price);
        int goldPrice = discountService.discount(StringGrade.GOLD,price);
        int diamondPrice = discountService.discount(StringGrade.DIAMOND,price);
        int nomal = discountService.discount("NOMAL",price);

        System.out.println("BASIC Price: "+basicPrice);
        System.out.println("GOLD Price: "+goldPrice);
        System.out.println("DIAMOND Price: "+diamondPrice);
    }
}
