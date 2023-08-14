package chapter_09;

import chapter_09.User.User;
import chapter_09.User.VIPUser;
import chapter_09.coffee.*;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("김지원");
        c2.ready();


        System.out.println("----------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("명수야");
        c4.ready();

        System.out.println("----------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("----------------------");

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5name = c5.name;
        System.out.println("주문 고객 번호 : " + c5name);

        Coffee<String> c6 = new Coffee<>("당연히가능해");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("----------------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("미야자키"));
        c7.ready();
        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("갤럭시"));
        c8.ready();

        System.out.println("---------------------");
        orderCoffee(36);
        System.out.println("---------------------");
        orderCoffee("전승민", "아메리카노");
        orderCoffee(37, "바닐라 라떼");
    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료 : " + name);
    }

}
