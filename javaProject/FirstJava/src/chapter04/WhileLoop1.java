package chapter04;

public class WhileLoop1 {

	public static void main(String[] args) {
			
		//A를 5번 출력
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		
		int num = 0; //초기식, 반복문의 조건에 사용하는 변수, 카운팅( 1 씩 증가)
		
		while (num <500) {
			System.out.println("A : " + num);
			num++; // num = num + 1, num += 1
		}
		
	}

	
	}

