package StringClass.문자열매서드;
/*
문자열 분할 및 조합
split(String regex) : 문자열을 정규 표현식을 기준으로 분할한다.
join(CharSequence delimiter, CharSequence... elements) : 주어진 구분자로 여러 문자열을
결합한다.
 */
public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //sprit()
        String[] splitStr = str.split(",");
        for(String s : splitStr){
            System.out.println(s);
        }

        //join()
        String joinStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열: "+joinStr);

        //문자열 배열 연결
        String result = String.join("-",splitStr);
        System.out.println("배열을 연결된 문자열로: "+result);
    }
}
