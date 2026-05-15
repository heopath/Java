package sub5;

/*
 * 날짜 : 2026/05/01
 * 이름 : 허민재
 * 내용 : Overriding 실습
*/

class AAA {
	public void method1() {
		System.out.println("AAA:method1...");
	}
	public void method2() {
		System.out.println("AAA:method2...");
	}
	public void method3() {
		System.out.println("AAA:method3...");
	}
}

class BBB extends AAA{
	@Override
	public void method2() {
		System.out.println("BBB:method2...");
	}
	public void method3(int a) {
		System.out.println("BBB:method3...");
	}
}

class CCC extends BBB{

//	@Override : 이노테이션 - Override 메서드를 표시하는 키워드, 기능은 없음
	@Override
	public void method1() {
		System.out.println("CCC:method1...");
	}

	@Override
	public void method2() {
		System.out.println("CCC:method2...");
	}

	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC:method3...");
	}
}

public class OverrideTest {
	public static void main(String[] args) {

		CCC c = new CCC();

		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);

		// Car override 메서드 실습
		Sedan avante = new Sedan("아반떼", "흰색", 0, 1500);

		avante.speedUp(200);
		avante.drive();

		Truck porter = new Truck("포터", "블루", 0, 0);
		porter.speedUp(200);
		porter.show();

		// Animal override 실습
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();
	}
}
