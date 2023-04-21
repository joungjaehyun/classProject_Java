package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.DeptDao;
import domain.Dept;
import util.ConnectionProvider;

public class DeptInsertService {
	
	DeptDao dao = null;

	private DeptInsertService() {
		
		this.dao = DeptDao.getInstance();
	}
	
	private static DeptInsertService service = new DeptInsertService();
	
	public static DeptInsertService getInstance() {
		
		if (service == null) {
			service = new DeptInsertService();
		}
		
		return service;
	}
	
	public int insertDept(Dept dept)  {
		
		// RequestDept (만약 임의의 번호를 받지않고 시퀀스 처리시) => dname,loc
		// 데이터 가공
		// Transaction
		
		Connection conn = null;
		int result =0;
		
		try {
			conn= ConnectionProvider.getConnection();
			result = dao.insertDept(conn, dept);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (conn!=null) {
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
