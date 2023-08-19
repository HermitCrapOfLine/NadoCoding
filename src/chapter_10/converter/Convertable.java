package chapter_10.converter;


// 함수형 인터페이스 : 추상 메소드가 하나만 존재해야한다
@FunctionalInterface
public interface Convertable
{
    void convert(int USD);
}
