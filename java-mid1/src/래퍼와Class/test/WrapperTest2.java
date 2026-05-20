package 래퍼와Class.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.0"};
        double sum = 0;
        for(String strNum:array){
            sum+=Double.parseDouble(strNum);
        }
        System.out.println("sum = "+sum);
    }
}
