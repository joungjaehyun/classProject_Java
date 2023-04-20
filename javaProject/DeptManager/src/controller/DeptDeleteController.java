package controller;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptDeleteService;

public class DeptDeleteController {

	
	DeptDeleteService deleteService;

	public DeptDeleteController() {
		
		this.deleteService = new DeptDeleteService();
	}
	
	public void deptDelete() {
		int deptno = getDeptNo();
		deleteService.deleteDept(deptno);
		
	}
	
	public int getDeptNo() {

		System.out.println("검색을 시작합니다.");

		System.out.println("검색할 부서번호를  입력하세요>>");

		return Integer.parseInt(DeptManagerMain.sc.nextLine());

	}
	
	

	
	
}
