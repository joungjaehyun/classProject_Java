package controller;

import domain.Dept;
import main.DeptManagerMain;
import service.DeptUpdateService;

public class DeptUpdateController {
	
	DeptUpdateService updateService;
	
	
	
	public DeptUpdateController() {
		this.updateService = new DeptUpdateService();
	}

	public void updateDept() {
		int deptno = getDeptNo();
		updateService.updateDept(update(deptno));
		
	}


	public int getDeptNo() {

		System.out.println("검색을 시작합니다.");

		System.out.println("수정할 부서번호를  입력하세요>>");

		return Integer.parseInt(DeptManagerMain.sc.nextLine());

	}
	
	public Dept update (int deptno) {
		Dept result =null;
	
		
		System.out.println("변경할 부서명을 입력해 주세요 >>");
		String dname =DeptManagerMain.sc.nextLine();
	
		System.out.println("변경할 부서지역을 입력해 주세요 >>");
		String loc = DeptManagerMain.sc.nextLine();
	
		result = new Dept (deptno,dname,loc);
		
		return result;
	}
}
