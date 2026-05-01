package sub01;

/*
문제 1.아래 요구사항을 충족하는 Book 클래스를 정의하세요.

<속성>
- title (String) : 책 제목
- author (String) : 저자 이름
- copies (int) : 이용 가능한 복사본 수

<메서드>
borrowBook()
- 이용 가능한 복사본이 있으면 copies를 1감소시키고 true를 반환
- 이용 가능한 복사본이 없으면 false를 반환

returnBook()
- copies를 1 증가

show()
- 모든 속성값을 출력
*/

public class Book {
	String title;
	String author;
	int copies;
	
	public boolean borrowBook() {
		if(this.copies >= 1) {
			this.copies -= 1;
			return true;
		}else
			return false;
	}
	
	public void returnBook() {
		this.copies += 1;
	}
	
	public void show() {
		System.out.println("책 제목 : " + this.title);
		System.out.println("저자 이름 : " + this.author);
		System.out.println("이용 가능한 복사본 수 : " + this.copies);
	}
}
