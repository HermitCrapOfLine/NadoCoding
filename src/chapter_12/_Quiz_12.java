package chapter_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        ProductA productA = new ProductA();
        ProductB productB = new ProductB();
        FinishProduct finishProduct = new FinishProduct();

        Thread a = new Thread(productA);
        Thread b = new Thread(productB);
        Thread f = new Thread(finishProduct);

        a.start();
        b.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            b.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        f.start();

    }
}

class ProductA implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i ++){
            System.out.println("A 상품 준비 " + i + "/5");
        }
        System.out.println(" -- A 상품 준비 완료 --");
    }
}

class ProductB implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i ++){
            System.out.println("B 상품 준비 " + i + "/5");
        }
        System.out.println(" -- B 상품 준비 완료 --");
    }
}

class FinishProduct implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++){
            System.out.println("세트 상품 포장 " + i + "/5");
        }

        System.out.println(" == 세트 상품 포장 완료==");
    }
}

