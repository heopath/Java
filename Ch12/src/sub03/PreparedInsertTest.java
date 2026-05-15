package sub03;

import java.util.Scanner;

/*
 * 날짜 : 2026/05/14
 * 이름 : 허민재
 * 내용 : JAVA 컬렉션 스트림 실습
 */

public class PreparedInsertTest {
	public static void main(String[] args) {

		System.out.println("데이터베이스 매니지먼트 프로그램");
		System.out.println("작업 선택하세요.(1:입력, 2:조회, 3:수정, 4:삭제");

		Scanner sc = new Scanner(System.in);
		int choiced = sc.nextInt();
		boolean exit = false;

		while (!exit) {
			switch (choiced) {
			case 0:
				exit = true;
				break;
			case 1:
				System.out.println("조회 작업...");
				break;
			case 2:
				System.out.println("입력 작업...");
				break;
			case 3:
				System.out.println("수정 작업...");
				break;
			case 4:
				System.out.println("삭제 작업...");
				break;
			}
		}
	}
}
