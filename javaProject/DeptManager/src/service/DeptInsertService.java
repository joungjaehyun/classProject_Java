package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {
	
	DeptDao dao = null;

	public DeptInsertService() {
		
		this.dao = new DeptDao();
	}
	
	public void addDept(Dept dept) {
		
		Connection conn = null;
		 try {
			 conn= ConnectionProvider.getConnection();
			dao.addDept(conn, dept.getDeptno(),dept.getDname(),dept.getLoc());
		 }catch(SQLException e){
			 e.printStackTrace();
		 }
	}
}
