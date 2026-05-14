package 불변객체.test;

/*
결과
date1 = 2024-1-1
date2 = 2024-1-1
2025 -> date1
date1 = 2025-1-1
date2 = 2025-1-1
 */
public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);

        date1 = date1.withYear(2025);
        System.out.println("2025 -> date1");
        System.out.println("date1 = "+date1);
        System.out.println("date2 = "+date2);
    }
}
