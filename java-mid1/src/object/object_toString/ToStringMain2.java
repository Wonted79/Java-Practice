package object.object_toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Dog dog1 = new Dog("메시",5);
        Dog dog2 = new Dog("날두",3);

        // toString으로 출력
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        //System.out.println 이 객체가 있을때 자동으로 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        //다형성을 활용
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

    }

}
