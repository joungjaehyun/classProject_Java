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
	
	public int insertDept(Dept dept) throws SQLException {
		
		// RequestDept (만약 임의의 번호를 받지않고 시퀀스 처리시) => dname,loc
		// 데이터 가공
		// Transaction
		
		
		
		return dao.insertDept(ConnectionProvider.getConnection(), dept); //controller 측에서 예외처리 해줘야됨
	}
}
