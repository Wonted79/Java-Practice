package StringClass.문자열최적화;

//매서드 체이닝으로 가독성 개선
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                .delete(6,8)
                .reverse()
                .toString();
        System.out.println("string = "+string);
    }
}
