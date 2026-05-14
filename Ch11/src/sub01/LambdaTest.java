package sub01;
/*
 * 날짜 : 2026/05/14
 * 이름 : 허민재
 * 내용 : JAVA 람다식 실습
 */

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double b);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double a);
}

public class LambdaTest {
	public static void main(String[] args) {
		
		// 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> { return a + b; };
		A a3 = (a, b) -> a + b; // {중괄호}가 없으면 return 생략
		
		// A 람다식 호출
		int r1 = a1.method(1, 2);
		int r2 = a2.method(1, 2);
		int r3 = a3.method(1, 2);
		
		System.out.println("r1 : " + r1);
		
		// B 람다식 정의
		B b1 = (double a) -> { System.out.println("a : " + a); };
		B b2 = (a) -> System.out.println("a : " + a);
		B b3 = System.out::println; // :: 메서드 참조연산자
		
		// B 람다식 호출
		b1.method(1.1);
		b2.method(1.1);
		b3.method(1.1);
	
		// C 람다식 정의, 호출
		C c1 = () -> { return true; };
		C c2 = () -> false;
		
		boolean rs1 = c1.method();
		boolean rs2 = c2.method();
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs1 : " + rs2);
		
		// D 람다식 정의, 호출
		D d1 = () -> { System.out.println("d1 호출..."); };
		D d2 = () -> System.out.println("d2 호출...");
		
		d1.method();
		d2.method();
		
		// E 람다식 정의, 호출
		E e1 = Math::ceil;
		E e2 = Math::floor;
		E e3 = Math::round;
		
		double rse1 = e1.method(1.2);
		double rse2 = e2.method(1.2);
		double rse3 = e3.method(1.5);
		
		System.out.println("rse1 : " + rse1);
		System.out.println("rse2 : " + rse2);
		System.out.println("rse3 : " + rse3);
		
	}
}
