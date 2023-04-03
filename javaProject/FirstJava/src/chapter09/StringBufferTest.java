package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer(); // 문자열을 생성
		System.out.println(sb1.capacity()); //size 기본값 16
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.capacity()); //size 기본값 16 + Hello size 5 최초 입력한 문자갯수 공간값+16
		
		// append
		//sb.append('~');// "Hello~"
		//sb.append(" JAVA"); // "Hello~ JAVA"
		sb.append('~').append(" JAVA"); // 가능한 이유 반환하는값이 sb 자체가 참조값이니깐 가능하다. 이런방법을 체이닝이라한다.
		System.out.println(sb);
		// delete
		sb.delete(5, 7); //5~(7-1)
		System.out.println(sb);
		
		// insert
		sb.insert(5, '~');
		System.out.println(sb);
		sb.insert(6, "~! ");
		System.out.println(sb);
		sb.insert(sb.length(), false);
		System.out.println(sb);

		// reverse
		sb.reverse();
		System.out.println(sb);
	
		String result = new String(sb);
		System.out.println(result);
	}
	

}
