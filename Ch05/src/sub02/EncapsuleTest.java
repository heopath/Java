package sub02;

/*
 * 날짜 : 2026/04/29
 * 이름 : 허민재
 * 내용 : Java 캡슐화 실습
*/

public class EncapsuleTest {
	public static void main(String[] args) {
		
		//객체 생성 - (브랜드, 색상, 속도)
		Car sonata = new Car("소나타", "흰색", 0); // 생성자 초기화
		Car avante = new Car(); // 생성자 초기화
		avante.setBrand("아반떼");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		//객체 초기화 -> 캡슐화된 속성을 생성자로 초기화		
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		// 속성값 수정
		sonata.setColor("은색");
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());
		
		sonata.show();
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "110-1234", "강감찬", 0);
		kb.show();
		
		// Book 객체 생성
		Book java = new Book("이것이 자바다", "신용권", 1);
		java.show();
		
		// Member 객체 생성
		Member mem = new Member("김유신", 20, false);
		mem.active();
		mem.show();
		
		// Movie 객체 생성 및 생성자 초기화
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 300);
		titanic.showDetails();
		
	}
}
