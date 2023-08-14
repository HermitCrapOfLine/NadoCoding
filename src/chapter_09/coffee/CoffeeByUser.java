package chapter_09.coffee;

import chapter_09.User.User;

public class CoffeeByUser <T extends User>{ // <> <- User 클래스와 User를 상속한 클래스만 상속받겠다는 의미
    public T user;

    public CoffeeByUser(T user){
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }

}
