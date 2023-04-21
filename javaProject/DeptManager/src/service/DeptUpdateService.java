package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptUpdateService {

	DeptDao dao;

	private DeptUpdateService() {

		this.dao = DeptDao.getInstance();
	}
	private static DeptUpdateService service = new DeptUpdateService();
	
	public static DeptUpdateService getInstance() {
		if (service ==null) {
			service = new DeptUpdateService();
		}
		
		return service;
	}
	
	public int updateDept(Dept newdept) {

		Connection conn = null;
		int result =0;

		try {
			conn = ConnectionProvider.getConnection();
			result =dao.updateDeptByDeptno(conn,newdept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
