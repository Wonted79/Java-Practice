package object.object공통인자;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        System.out.println(Dog.class);
        Object obj = new Dog();
        action(dog);
        action(car);
    }
    /* 공통 상위객체인 Object를 사용하여 인자로 받을 수 있도록 한다.
     ex) Object obj = dog or car;
    대신 각 객체의 고유한 매서드는 object를 통해 바로 호출이 불가능하니 다운캐스팅
     */
    public static void action(Object obj) {
        //obj.sound(); //-> 오류

        if(obj instanceof Dog dog){
            dog.sound();
        }
        else if (obj instanceof Car car){
            car.move();
        }
        /*
        if (obj.getClass() == Dog.class){
            Dog dog = (Dog) obj;
            dog.sound();
        }
        else if (obj.getClass() == Car.class){
            Car car = (Car) obj;
            car.move();
        }
         */
    }
}
