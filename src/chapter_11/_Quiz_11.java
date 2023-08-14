package chapter_11;


import com.sun.org.apache.xml.internal.utils.PrefixResolverDefault;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 1;

        try {
            if (errorCode == 1) {
                throw new TimeOverBuyItems("상품 구매 가능 시간이 아닙니다.");

        } else if (errorCode == 2) {
                throw new SoldOutAllOfItems("해당 상품은 매진되었습니다.");
        } else {
                System.out.println("상품 구매를 완료하였습니다.");
            }

        } catch (TimeOverBuyItems e){

            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutAllOfItems e){

            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class TimeOverBuyItems extends Exception{

    public TimeOverBuyItems(String message) {
        super(message);
    }
}

class SoldOutAllOfItems extends Exception {

    public SoldOutAllOfItems(String message) {
        super(message);
    }
}
