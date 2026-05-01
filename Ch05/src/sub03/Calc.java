package sub03;

import java.io.ObjectInputStream.GetField;

/*
 * 날짜 : 2026/04/30
 * 이름 : 허민재
 * 내용 : Java 계산기 실습
*/

public class Calc {
	// 싱글톤 객체
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {} // 외부에서 객체 생성을 막기 위한 private 생성자
	
	// 기능
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		
	}
}
