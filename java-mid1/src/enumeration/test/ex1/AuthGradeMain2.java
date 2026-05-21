package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST,LOGIN,ADMIN]:");

        String inputGrade = sc.next();
        //입력값이 AuthGraded의 상수값으로 직결된다면 찾는 매서드는 필요 없다.
        //AuthGrade myGrade = findAuthGrade(inputGrade);
        AuthGrade authGrade = AuthGrade.valueOf(inputGrade);
        System.out.println("당신의 등급은 "+authGrade.getDescription()+"입니다.");
        displayByLogLevel(authGrade);
        }

    private static void displayByLogLevel(AuthGrade authGrade){
        System.out.println("==메뉴 목록==");
        if(authGrade.getLevel()>=1){
            System.out.println("- 메인 화면");
        }
        if(authGrade.getLevel()>=2){
            System.out.println("- 이메일 관리 화면");
        }
        if(authGrade.getLevel()>=3){
            System.out.println("- 관리자 화면");
        }

    }
}
