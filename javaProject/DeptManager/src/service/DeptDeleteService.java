package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptDeleteService {

	DeptDao dao;
	
	public DeptDeleteService() {

		this.dao = new DeptDao();
	}
	
	public void deleteDept(int deptno) {

		Connection conn = null;
		

		try {
			conn = ConnectionProvider.getConnection();
			dao.deleteByDeptno(conn,deptno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
