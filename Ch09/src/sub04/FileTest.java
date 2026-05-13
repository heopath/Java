package sub04;

import java.io.File;
import java.io.IOException;

/*
 * 날짜 : 2026/05/13
 * 이름 : 허민재
 * 내용 : JAVA 파일 관리 실습
 */

public class FileTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\GGG\\Desktop\\test3.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test";
		
		// 파일 객체 생성
		File file1 = new File(source);
		File file2 = new File(target);
		
		try {
			// 파일 생성
			file1.createNewFile();
			file2.mkdir();			
			
			System.out.println("file1 존재 여부 : " + file1.exists());
			System.out.println("file2 존재 여부 : " + file2.exists());
			System.out.println("file1 파일 여부 : " + file1.isFile());
			System.out.println("file1 폴더 여부 : " + file1.isDirectory());
			System.out.println("file1 파일 이름 : " + file1.getName());
			System.out.println("file2 파일 이름 : " + file2.getName());
			System.out.println("file1 파일 경로 : " + file1.getPath());
			System.out.println("file1 절대 경로 : " + file1.getAbsolutePath());
			
			file1.delete();
			file2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
