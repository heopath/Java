package sub01;

/*
 * 날짜 : 2026/04/29
 * 이름 : 허민재
 * 내용 : Java 클래스 실습
*/

public class ClassTest {
	public static void main(String[] args) {
		
		//객체 생성 - 사용자 정의 타입
		Car sonata = new Car();
		
		//객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		//객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//생성, 초기화, 활용
		Car avante = new Car();
		avante.brand = "아반떼";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		//Account 객체 생성 및 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		/*
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 101-22-1001
		 입금주 : 김춘추
		 현재잔액 : 15000
		 */
		
		Account wb = new Account();
		wb.bank = "우리은행";
		wb.id = "110-22-1001";
		wb.name = "김춘추";
		wb.balance = 0;
		
		wb.deposit(20000);
		wb.withdraw(5000);
		wb.show();
		 
		Book bk = new Book();
		bk.title = "이것이 자바다";
		bk.author = "신용권";
		bk.copies = 0;
		
		boolean result = bk.borrowBook();
		
		if(result) {
			System.out.println("대출 성공");
			bk.show();
		}else {
			System.out.println("대출 실패!!");
			bk.returnBook();
			bk.show();
		}
		
		Member m = new Member();
		m.name = "정인길";
		m.age = 19;
		m.isActive = false;
		
		m.active();
		
		boolean isAdult = m.isAdult();
		
		if(isAdult) {
			m.show();
			System.out.println("성인 입니다.");
		}else {
			m.show();
			System.out.println("미성년자 입니다.");
		}
		m.show();
	}
}
