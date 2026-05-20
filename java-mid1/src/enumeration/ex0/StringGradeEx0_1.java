package enumeration.ex0;

public class StringGradeEx0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basicPrice = discountService.discount("BASIC",price);
        int goldPrice = discountService.discount("GOLD",price);
        int diamondPrice = discountService.discount("DIAMOND",price);
        int nomal = discountService.discount("NOMAL",price);

        System.out.println("BASIC Price: "+basicPrice);
        System.out.println("GOLD Price: "+goldPrice);
        System.out.println("DIAMOND Price: "+diamondPrice);
    }
}
