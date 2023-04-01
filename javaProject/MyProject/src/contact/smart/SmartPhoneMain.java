package contact.smart;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone smartPhone = SmartPhone.getInstance();

		// 입력
		smartPhone.insertContact();
		System.out.println();

		// 전체 출력
		smartPhone.printAllData();
		System.out.println();

		// 이름 검색 후 결과 출력
//		smartPhone.searchInfoPrint1();
//		System.out.println();

		// 이름 검색 후 정보 수정
		smartPhone.editContact();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.printAllData();

		// 이름 검색 후 삭제
//		smartPhone.deleteContact1();
//		System.out.println();
//		smartPhone.searchInfoPrint1();
//		System.out.println();
//		smartPhone.printAllData1();
//
//		// 이름 검색 후 삭제
//		smartPhone.deleteContact1();
//		System.out.println();
//		smartPhone.searchInfoPrint1();
//		System.out.println();
//		smartPhone.printAllData1();
	}
}


