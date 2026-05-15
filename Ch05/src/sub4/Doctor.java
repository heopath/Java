package sub4;

public class Doctor extends Person {

	public Doctor(String name, int age, String spcialty) {
		super(name, age);
		this.spcialty = spcialty;
	}

	public String spcialty;

	@Override
	public void work() {
		super.introduce();
		System.out.println("저는 의사이며 전공은 " + spcialty + " 입니다.");
	}
}
