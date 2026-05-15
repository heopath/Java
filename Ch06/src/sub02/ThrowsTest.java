package sub02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2026/05/11
 * 이름 : 허민재
 * 내용 : JAVA throws 메서드에서 예외 던지기 실습
 */

public class ThrowsTest {
	public static void main(String[] args) {

		try {
			method1();
		}catch (InputMismatchException e) {
			System.out.println("1. 예외발생! - " + e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("2. 예외발생! - " + e.getMessage());
		}

		System.out.println("프로그램 정상 종료...");
	}

	public static void method1() throws InputMismatchException, ArithmeticException{

		try {
			method2();
		} catch (InputMismatchException e) {

		} catch (ArithmeticException e) {

		}
	}

	public static void method2() throws InputMismatchException { // 예외를 던짐

		Scanner scan = new Scanner(System.in);
		System.out.println("입력 : ");
		int number = scan.nextInt(); // InputMissMatchException 발생

		int result = 10 / number; // ArithmeticException 발생

		System.out.println("result : " + result);
	}
}
