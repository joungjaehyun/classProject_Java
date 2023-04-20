package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptUpdateService {

	DeptDao dao;

	public DeptUpdateService() {

		this.dao = new DeptDao();
	}
	
	public void updateDept(Dept dept) {

		Connection conn = null;
		

		try {
			conn = ConnectionProvider.getConnection();
			dao.updateByDeptno(conn,dept.getDeptno(),dept.getDname(),dept.getLoc());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}
