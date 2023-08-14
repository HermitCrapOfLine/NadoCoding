package chapter_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); //0 이상 10 미만의 정수형
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0미만의 실수 값
        //System.out.println("랜덤 실수 (범위) : " + random.nextDouble()

        double min = 5.0;
        double max = 10.0;

        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1 ~ 45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1 이상 46 미만의 수 = 1 이상 45이하의 수

        // Math, Scanner, StingBuidler, StringBuffer, StringTokenizer
        // BigInteger. BigDecimal
        // LocalDate,
    }

}
