package chapter09;

public class ObjectTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("2023A001");
		Car c2 = new Car("2023B001");
		Car c3 = c1;
		Car c4 = new Car("2023A001");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c1.equals("2023A001"));
	}

}

class Car{

	String carNo;
	
	Car(String carNo){
		this.carNo = carNo;
	}
	@Override
	public boolean equals(Object obj) {
		// obj => null => false
		// obj => Car 타입으로 형변화 가능해야한다!
		
		Car car =null;
		if(obj != null && obj instanceof Car) {
			// ojb => 형변환 하고 carno를 비교해서 결과값을 반환
			car = (Car)obj;
			
			// 문자열으 비교해서 같은지 여부 반환
			if (carNo.equals(car.carNo)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carNo + " 차량입니다.";
	}
	
	
}