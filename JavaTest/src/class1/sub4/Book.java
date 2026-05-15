package class1.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
	}

	public void borrowBook() {
		if(!isBorrowd) {
			isBorrowd = true;
			System.out.println("대출 완료");
		} else {
			System.out.println("이미 대출 된 도서");
		}
	}

	public void returnBook() {
		if(isBorrowd) {
			isBorrowd = false;
			System.out.println("반납 완료");
		}else {
			System.out.println("대출되지 않은 도서");
		}
	}

	public void getBookInfo() {
		System.out.println("제목 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("ISBN : " + this.isbn);
		System.out.println("대출 여부 : " + (this.isBorrowd ? "불가능" : "가능"));
	}

	public String getTitle() {
		return this.title;
	}

}
