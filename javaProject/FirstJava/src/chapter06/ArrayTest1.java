package chapter06;


public class ArrayTest1 {
	public static void main(String[] args) {
		
		// 배열의 선언 
		int [] scores; //int 타입의 배열 인스턴스 주소를 가지는 변수

		// 배열의 생성
		scores = new int [10];// int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("================");
		// 배열 요소의 참조
		// 배열이름[index]
		// index => 0 ~ 배열 요소의 개수-1
		// 요소의 개수 => 배열변수이름.length
		
		scores[0] = 64;
		scores[1] = 73;
		scores[2] = 96;
		scores[3] = 57;
		scores[4] = 78;
		scores[5] = 99;
		scores[6] = 100;
		scores[7] = 82;
		scores[8] = 71;
		scores[9] = 78;
		//scores[10] = 60;
		
		
		// 총합
		int sum = 0;
		float avg = 0.0f;
		
		//System.out.println(scores[1]);
		// index => 0~9
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum = sum + scores[i];
		}
		
		avg = sum/(float)scores.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
