package sub04;
/*
 * 날짜 : 2026/05/14
 * 이름 : 허민재
 * 내용 : JAVA 스트림 매핑 실습
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("김유신", 25));
		persons.add(new Person("김춘추", 35));
		persons.add(new Person("강감찬", 45));
		persons.add(new Person("장보고", 55));
		
		System.out.println(persons);
	
		// mapXXX() - 하나의 원소를 다른값으로 변환
		persons
			.stream()
			.map(person -> {
				return person.getName();
			})
			.forEach( name -> {
				System.out.println(name + " ,");
			});
		
		System.out.println("\n");
		
		int sum = persons
				.stream()
				.mapToInt(person -> {
					return person.getAge();
				})
				.sum();
		
		System.out.println("전체 나이 합 : " + sum);
		
		// flatmapXXX() - 하나의 원소를 하나 이상 다른값으로 변환
		List<String> cities= List.of("서울,대전", "대구,부산", "광주,인천", "울산,수원", "양산,김해");
		
		
		List<String> resultList = cities
									.stream()
									.flatMap( city -> {
										String[] values = city.split(",");
										
										return Arrays.stream(values);
									})
									.collect(Collectors.toList());
		
		System.out.println(resultList);
		System.out.println(resultList.size());
		
	}
}
