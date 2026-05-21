package generic.ex1;

//타입 파라미터 T
public class GenericBox<T>{
    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}
