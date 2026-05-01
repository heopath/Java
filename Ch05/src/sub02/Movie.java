package sub02;

public class Movie {
	private String title;
	private String Director;
	private double rating;
	private int availableSeats;
	
	public Movie (String title, String Director, double rating, int availableSeats) {
		this.title = title;
		this.Director = Director;
		this.rating = rating;
		this.availableSeats = availableSeats;
	}
	
	public Movie () {}
	
	public boolean reserveSeat(){
		if(availableSeats >= 1) {
			availableSeats--;
			return true;
		}else {
			return false;
		}
	}
	
	public void cancelReservation() {
		this.availableSeats++;
	}
	
	public void showDetails() {
		System.out.println("영화 제목 : " + this.title);
		System.out.println("감독 이름 : " + this.Director);
		System.out.println("영화 평점 : " + this.rating);
	}
}
