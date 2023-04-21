package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptDeleteService {

	DeptDao dao;
	
	private DeptDeleteService() {

		this.dao = DeptDao.getInstance();
	}
	
	private static DeptDeleteService service = new DeptDeleteService();
	public static DeptDeleteService getInstance() {
		if (service ==null) {
			service = new DeptDeleteService();
		}
		return service;
	}
	
	
	public int deleteDept(int deptno) {

		Connection conn = null;
		int result =0;

		try {
			conn = ConnectionProvider.getConnection();
			result =dao.deleteByDeptno(conn,deptno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	
	}
}
