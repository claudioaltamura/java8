package de.claudioaltamura.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExamCalculator {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		Student peter = new Student("Peter");
		Student fred = new Student("Fred");
		students.add(peter);
		students.add(fred);

		List<Exam> exams = new ArrayList<Exam>();
		Exam writing = new Exam("Writing");
		Exam reading = new Exam("Reading");
		exams.add(writing);
		exams.add(reading);
		
		Map<Exam, Grade> examsPeter = peter.getExams();
		examsPeter.put(writing, new Grade(3));
		examsPeter.put(reading, new Grade(2));

		Map<Exam, Grade> examsFred = fred.getExams();
		examsFred.put(writing, new Grade(1));
		examsFred.put(reading, new Grade(1));
	
		//classic way
		float averageGrade = calculateAverageGrade(students);
		System.out.println("averageGrade = " + averageGrade);
		
		//stream way
		final List<Grade> allGrades = new ArrayList<Grade>();
		for(Student s : students) {
			for (Grade value : s.getExams().values()) {
				allGrades.add(value);
			}
		}
//		int x = allGrades.stream()
//			.map((Function<Grade,Integer>) (g) -> g.getGrade())
//			.reduce(0, (Integer a, Integer b) -> 
//				a + b / allGrades.size()	
//			);
//		System.out.println("stream way, averageGrade = " + x);
		
	}

	private static float calculateAverageGrade(List<Student> students) {
		int sum = 0;
		int cnt = 0;
		for(Student s : students) {
			for (Grade value : s.getExams().values()) {
			    System.out.println("value = " + value.getGrade());
			    sum += value.getGrade();
			    cnt++;
			}
		}
		
		return (float)sum / cnt;
	}

}