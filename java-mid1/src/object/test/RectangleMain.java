package object.test;

/*
Rectangle{width=100, height=20}
Rectangle{width=100, height=20}
false
true
다음과 같은 실행결과가 나오도록 만들기
 */
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(100,20);
        Rectangle rect2 = new Rectangle(100,20);

        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        System.out.println(rect1==rect2);
        System.out.println(rect1.equals(rect2));
    }
}
