package chapter_12.clean;

public class Room {
    public int number = 1;
    synchronized public void clean(String name){
        // 직원1 : 3번방 청소 완료
        System.out.println(name + " : " + number + "번방 청소 중");
        number++;
    }
}
