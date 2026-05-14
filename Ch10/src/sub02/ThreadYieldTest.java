package sub02;

/*
 * 날짜 : 2026/05/14
 * 이름 : 허민재
 * 내용 : JAVA 스레드Yeild 실습
 */

class Sub1Thread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=1000; i++) {
			System.out.println("Sub1 스레드 실행..." + i);		
			Thread.yield();
		}
	}
}

class Sub2Thread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=1000; i++) {
			System.out.println("Sub2 스레드 실행..." + i);		
			//Thread.yield();
		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		
		Sub1Thread s1t = new Sub1Thread();
		Sub2Thread s2t = new Sub2Thread();
		
		s1t.start();
		s2t.start();
		
		System.out.println("Main 스레드 종료...");
		
	}
}
