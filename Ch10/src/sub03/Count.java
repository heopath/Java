package sub03;

public class Count {

	private int num;
	
	public int getNum() {
		return num;
	}
	
	public void setNum() {
		// 임계영역 : 멀티 스레드에 의해 공유자원이 참조되는 코드 범위, 동기화 대상 영역
		
		synchronized(this) {
		// 동기화 영역
			num++;	
		}
	
	}
}
