package sub01;

//치환변수 T를 갖는 제네릭 클래스
public class FruitBox<T> { 
	// 다른 클래스로도 객체를 만들기 위해서(Apple, Banana) 
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
