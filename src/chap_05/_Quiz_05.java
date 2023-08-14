package chap_05;

// 신발 사이즈는 250부터 295까지 5 단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250 (재고 있음)
// 사이즈 255 (재고 있음)
// ...

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] shoes = new int[10];
        int shoesSize = 250;

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = shoesSize;
            shoesSize += 5;
        }

        for (int size:
             shoes) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
