package chapter_11;

public class _02_Catch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error 수습불가, 예외 exception 수습가능)

        try{
            // System.out.println(3 / 0);

//            int[] arr = new int[3];
//          arr[5] = 100;
//          Object obj = "test";
//          System.out.println((int) obj);

//          String s = null;
//            System.out.println(s.toLowerCase());

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 계산을 하셨네요.");
            e.printStackTrace();
        //} catch (ArrayIndexOutOfBoundsException e){
         //   System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e){
            System.out.println("잘못된 형 변환 입니다.");
        } catch (Exception e){
            System.out.println("그 외의 모든 에러는 여기서 처리합니다.");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }

}
