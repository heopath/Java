package sub03;
/*
 * 날짜 : 2026/05/11
 * 이름 : 허민재
 * 내용 : JAVA throw 예외 발생 시키기 실습
 */

// 예외 클래스 선언
class MinusException extends Exception {
	public MinusException(String Message) {
		super(Message);
	}
}

class Score {
	public void check(int score) throws MinusException {
		
		if(score < 0) {
			
			//예외를 발생 시키기
			throw new MinusException("점수는 음수가 될수 없습니다.");
			
		} else {
			System.out.println("점수값 : " + score);
		}
	}
	
}
public class ThrowTest {
	public static void main(String[] args) {
		Score score = new Score();
		
		try {
			score.check(-1);
		} catch (MinusException e){
			e.printStackTrace();
		}

	}
}
