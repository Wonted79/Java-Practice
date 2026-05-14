package StringClass.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        String[] parts = fruits.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("joinedString = "+String.join("->",parts));
    }
}
