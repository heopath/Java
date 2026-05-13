package sub01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2026/05/13
 * 이름 : 허민재
 * 내용 : JAVA 파일 입출력 실습
 */

public class FileIOTest {
	public static void main(String[] args) {
		
		// 입출력 파일 경로 설정
		String source = "C:\\Users\\GGG\\Desktop\\test1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\test2.txt";
		
		// 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(source);	 //입력스트림
			FileOutputStream fos = new FileOutputStream(target); //출력 스트림
			
			while(true) {
				int data = fis.read(); // 파일 읽기
				
				if(data == -1) { // 파일 읽을 내용이 없으면
					break;
				}
				//char ch = (char) data;
				//System.out.print(ch);
				
				// 파일 쓰기
				fos.write(data);
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그래 종료...");
	}
}
