package chapter06;

public class Member {

	int memberNO;
	String memberID;
	String memberName;

	public Member(int memberNO, String memberID, String memberName) {
		this.memberNO = memberNO;
		this.memberID = memberID;
		this.memberName = memberName;
	}

	@Override //어노테이션 
	public String toString() {
		return "Member [memberNO=" + memberNO + ", memberID=" + memberID + ", memberName=" + memberName + "]";
	}

	

}
