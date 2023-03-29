package array;

public class ArrayExam2 {

	public static void main(String[] args) {

		// Student 타입의 배열 생성 : 데이터 10개 저장가능
		Student[] students = new Student[10];
		students[0] = new Student("son01", 100,40, 70);
		students[1] = new Student("son02", 50,50, 60);
		students[2] = new Student("son03", 60,60, 50);
		students[3] = new Student("son04", 70,70, 40);
		students[4] = new Student("son05", 80,80, 30);
		students[5] = new Student("son06", 90,90, 80);
		students[6] = new Student("son07", 100,40, 70);
		students[7] = new Student("son08", 90,50, 60);
		students[8] = new Student("son09", 80,60, 90);
		students[9] = new Student("son10", 70,70, 80);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("=========================================");
		
		for(Student student : students) {
			System.out.println(student.result());
		}
	}

}
