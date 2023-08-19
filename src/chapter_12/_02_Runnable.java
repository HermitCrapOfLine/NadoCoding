package chapter_12;

import chapter_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        // 스레드를 만드는 방법은 Thread를 상속하거나 Runnable을 구현
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();

    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i += 2){
            System.out.println("(사장)" + i + "번방 청소 중");
        }

        System.out.println("-- 사장 청소 끝 --");
    }
}
