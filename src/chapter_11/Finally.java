package chapter_11;

public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("오늘은 휴무택시");
//            System.out.println("택시에 탑승한다.");
        } catch (Exception e) {
            System.out.println("!! 문제 발생 : " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch(s)
        // try + catch(s) + finally
        // try + finally

        System.out.println("-----------------");

        try{
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }



    }
}
