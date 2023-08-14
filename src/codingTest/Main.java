package codingTest;

import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    // 대문자를 소문자로 소문자를 대문자로 변환한 값을 저장할 스트링 빌더 참조 변수 sb 선언
    public String solution(String str) {
        String answer = "";
        // 답을 제출할 String 자료형 answer 변수 선언

        for (char c : str.toCharArray()) {
            if(c == Character.toUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }else {
                sb.append(Character.toUpperCase(c));
            }
        }
        /* char형 c 변수에 str 단어 하나씩 대입한다.
        대입 된 값이 대문자이면 소문자로 소문자이면 대문자로 변환해서 sb에 저장한다.
        ex) str = aBc 이면 c에 a, B, c 를 순서대로 요소를 전달
        a가 대문자가 아니기 때문에 else로 넘어가서 대문자로 변경
        B가 대문자 이기때문에 if문으로 진행해서 소문자로 변경
        c가 대문자가 아니기 때문에 else로 넘어가서 대문자로 변경
         */


        return answer = sb.toString();
        // sb에 저장된 값을 출력한다.
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));

    }
}

