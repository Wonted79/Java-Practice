package generic.ex3;

public class AnimalHospitalV2 <T>{
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        animal.toString();
        animal.equals(null);
        /*
        제네릭 클래스는 클래스 사용시점에 타입이 정해지므로
        컴파일시 타입 필효한 코드는 컴파일 오류
         */
        //System.out.println("동물 이름: "+animal.getName();
        //animal.sound();
    }
    public T getBigger(T target) {
        // 컴파일 오류
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}
