package collection.map.test.cart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartMap = new HashMap<>();
    public Cart() {

    }

    public void add(Product product,int addQuantity){
        int existingQuantity = cartMap.getOrDefault(product,0);
        cartMap.put(product,existingQuantity+addQuantity);
    }

    public void minus(Product product,int minusQuantity){
        int existingQuantity = cartMap.getOrDefault(product,0);
        int newQuantity = existingQuantity-minusQuantity;
        if(newQuantity <=0){
            cartMap.remove(product);
        }
        else {
            cartMap.put(product,newQuantity);
        }
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Product product: cartMap.keySet()){
            System.out.println("상품: Product{name='"+product.getName()+
                    "', price="+product.getPrice()+"} 수량:"+cartMap.get(product));
        }
    }

}
