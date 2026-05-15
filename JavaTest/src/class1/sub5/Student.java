package class1.sub5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;

	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}

	public void enrollSubject(Subject subject) {
		// subjects[subjectCount++] = subject;
		if (subjectCount < subjects.length) {
			subjects[subjectCount] = subject;
			scores[subjectCount] = 0;
			this.subjectCount++;

			subject.addStudent(this); // this는 현재 Student 객체(student1)

			System.out.println("수강신청" + subject.getSubName());
		} else {
			System.out.println("더 신청 불가");
		}
	}

	public void setScore(Subject subject, int score) {
		for (int i = 0; i < subjectCount; i++) {
			if (subjects[i] == subject) {
				scores[i] = score;
				System.out.println(subject.getSubName() + "성적입력");
				return;
			} else {
				System.out.println("성적 입력 불가");
			}
		}
	}

	public void printStudentInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("ID : " + this.studentId);

		if (subjectCount == 0) {
			System.out.println("수강 과목 없음");
		} else {
			for (int i = 0; i < subjectCount; i++) {
				System.out.println(subjects[i].getSubName() + " : " + scores[i] + "점");
			}
		}
	}

	public String getName() {
		return this.name;
	}
}
