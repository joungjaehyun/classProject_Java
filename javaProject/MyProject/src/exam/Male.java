package exam;

public class Male extends Person {

	
	private String msg;
	
	public Male(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
		
	}

	@Override
	public void printGreeting() {
		// TODO Auto-generated method stub
		super.printGreeting();
		System.out.println(msg);
	}
	
	void hello() {
		System.out.println("안녕하세요!!!!");
	}

	
	
	
}
