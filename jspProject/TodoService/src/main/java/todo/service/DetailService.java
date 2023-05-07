package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import util.ConnectionProvider;

public class DetailService {

	TodoDAO dao;
	
	private DetailService () {
		this.dao=TodoDAO.getInstance();
	}
	private static DetailService service = new DetailService();
	
	public static DetailService getInstance() {
		return service;
	}
	
	public TodoDTO getTodo(String personID, int todoNum) {
		Connection conn = null;
		TodoDTO todo = null;
		
		try {
			conn=ConnectionProvider.getConnection();
			
			todo=dao.selectByIDandNUM(conn, personID, todoNum);
			
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
		
		return todo;
	}
	
}
