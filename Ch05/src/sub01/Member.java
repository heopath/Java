package sub01;

 /*
  문제 2. 회원 클래스 정의
  
  아래 요구 사항을 충족하는 Member 클래스를 정의하세요.
  
  <속성>
  	name (String) : 회원이름
  	age (int) : 나이
  	isActive (boolean) : 활성 회원 여부
  	
  	<메서드>
  		active()
  		- isActive를 true로 변경
  		
  		deactive()
  		- is Active를 false로 변경
  		
  		isAdult()
  		- 나이가 20 이상이면 true, 아니면 false로 반환
  		
  		show()
  		- 모든 속성값 출력
  */
public class Member {
	String name;
	int age;
	boolean isActive;
	
	public void active() {
		this.isActive = true;
	}
	
	public void deactive() {
		this.isActive = false;
	}
	
	public boolean isAdult() {
		if(this.age >= 20) {
			return true;
		}else 
			return false;
	}
	
	public void show() {
		System.out.println("회원이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("활성 회원 여부 : " + this.isActive);
		
	}
}
