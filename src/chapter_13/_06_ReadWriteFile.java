package chapter_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        // 파일 쓰기
//        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
//            bw.write("1. 이제 거의 끝이 보여요.");
//            bw.newLine();
//            bw.write("2. 사실 두 강의 더 남았어요...");
//            bw.newLine();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))) {
            String line;
            while( (line = br.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
