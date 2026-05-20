package 래퍼와Class.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = "+integer1);

        Integer num = 100;
        int integer2 =  num.intValue();
        System.out.println("integer2 = "+integer2);

        Integer integer3 = Integer.valueOf(integer2);
        System.out.println("integer3 = "+integer3);
    }
}
