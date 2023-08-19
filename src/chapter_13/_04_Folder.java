package chapter_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {

        String folderName = "A/B/C";


        File folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()){
            System.out.printf("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }
    }
}
