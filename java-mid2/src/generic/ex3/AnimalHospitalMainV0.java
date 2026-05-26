package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

// 타입 안정성 o , 코드 재사용성x
public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1",100);
        Cat cat = new Cat("고양이1",300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        //dogHospital.set(cat);
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2",200));
        System.out.println("biggerDog = "+biggerDog);
    }
}
