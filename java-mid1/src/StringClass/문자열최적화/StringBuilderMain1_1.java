package StringClass.문자열최적화;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = "+sb);

        sb.insert(4,"Java");
        System.out.println("insert = "+sb);

        sb.delete(4,8);
        System.out.println("delete = "+sb);

        sb.reverse();
        System.out.println("reverse = "+sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = "+string);

        System.out.println(sb.getClass());
        System.out.println(string.getClass());

        StringBuilder sb2 = new StringBuilder();
        String string2 = "hi";
        sb2.append(string2);
        sb2.insert(1,"lee");
        string2 = sb2.toString();
        System.out.println("string2 = "+string2);
    }
}
