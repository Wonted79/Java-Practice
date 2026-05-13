package object.object공통기능;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        Object parent = new Parent();
        Object object = new Object();

        Child temp = child;
        child.ChildMethod();
        child.ParentMethod();

        System.out.println(child.toString());
        System.out.println(child.equals(temp));
        System.out.println(child.getClass());

        System.out.println(parent.toString());
        System.out.println(parent.equals(temp));
        System.out.println(parent.getClass());

        System.out.println(object.toString());
        System.out.println(object.equals(temp));
        System.out.println(object.getClass());

    }
}
