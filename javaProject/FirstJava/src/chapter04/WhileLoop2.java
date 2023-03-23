package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {

		int num = 1;
		
		while(num<10) { // 행을 표현 9번 반복
			
			
			int n = 2;
			while (n<10) { // 열을 표현 8번 반복
				System.out.print(n+ " x " + num + " = " + n * num + "\t");
				n++;
				
			}
			
			//System.out.println("2 x  " + num + " = " + 2 * num );
			
			
			//System.out.print("2 x  " + num + " = " + 2 * num );
			//System.out.print("\t 3 x  " + num + " = " + 3 * num );
			//System.out.print("\t 4 x  " + num + " = " + 4 * num );
			/// ....
			//System.out.print("\t 9 x  " + num + " = " + 9 * num );

			System.out.println();
			num++;
		}
	}

}
