package controller;

import service.DeptInsertService;
import domain.Dept;
import main.DeptManagerMain;
public class DeptInsertController {

	DeptInsertService insertService;

	public DeptInsertController() {
	
		this.insertService = new DeptInsertService();
	}
	
	public void insert() {
		
		
		insertService.addDept(addDept());
	}
	
	
	// 사용자의 입력을 받는 메소드
	
	public Dept addDept () {
		Dept result =null;
		System.out.println("부서번호를 입력해 주세요 >>");
		int deptno =Integer.parseInt(DeptManagerMain.sc.nextLine());
		System.out.println("부서명을 입력해 주세요 >>");
		String dname =DeptManagerMain.sc.nextLine();
		System.out.println("부서지역을 입력해 주세요 >>");
		String loc = DeptManagerMain.sc.nextLine();
		
		result = new Dept(deptno,dname,loc);
		
		return result;
	}
	
}
