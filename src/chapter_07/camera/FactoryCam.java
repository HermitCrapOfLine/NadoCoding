package chapter_07.camera;

// Factory Cam is a Camera (IS - A) 상속관계
public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
        super();
    }

    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo();
        detectFire();
    }
    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }


}
