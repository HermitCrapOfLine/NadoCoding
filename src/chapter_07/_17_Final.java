package chapter_07;

import chapter_07.camera.ActionCam;
import chapter_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // final

        // public (final) class..
        // public (final) void..
        // public > abstract > static > final
        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("----------------");

        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();

    }
}
