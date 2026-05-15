package sub06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2026/05/12
 * 이름 : 허민재
 * 내용 : JAVA 내장클래스 실습 - Date, Calender
 */
public class CalenderTest {
	public static void main(String[] args) {
		// Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);

		// 날짜시간 형식 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String now = sdf.format(date);

		System.out.println(now);

		//Calendar 클래스
		Calendar cal = Calendar.getInstance(); // 싱글톤 객체

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int cdate = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d %d:%d:%d", year, month, cdate, hour, min, sec);

	}
}
