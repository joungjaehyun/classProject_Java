package chapter03;

public class Operator05 {

	public static void main(String[] args) {
		
		int num1 = 30;
		System.out.println(num1++); // output : 30  value of num1 : 31
		System.out.println(++num1); // output : 32  value of num1 : 32
		System.out.println(num1--); // output : 32  value of num1 : 31
		System.out.println(--num1); // output : 30  value of num1 : 30
		
		
		System.out.println(num1++ + ++num1); // 30 +((30+1)+1)

	}

}
