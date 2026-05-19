package 래퍼와Class.래퍼클래스필요성;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1,0,1,100};
        System.out.println(findValue(intArr,-1));
        System.out.println(findValue(intArr,0));
        System.out.println(findValue(intArr,1));
        System.out.println(findValue(intArr,100));
    }

    public static int findValue(int[] intArr,int target){
        for (int value:intArr){
            if(value==target){
                return value;
            }
        }
        return -1; //target 숫자를 intArr에서 찾을 수 없음.
    }
    //100을 넣어서 -1 이 반환된것인지 -1을 넣어서 -1이 반환된것인지 알 수 없음.
}
