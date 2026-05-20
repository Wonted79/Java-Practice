package 래퍼와Class;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //시드값 포함 가능
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt: "+randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble: "+randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: "+randomBoolean);

        //범위 조회
        int randomRange1 = random.nextInt(10); //0~10
        System.out.println("0~9: "+ randomRange1);
        int randomRange2 = random.nextInt(10)+1; //1~10까지 출력
        System.out.println("1~10: "+randomRange2);
    }
}
