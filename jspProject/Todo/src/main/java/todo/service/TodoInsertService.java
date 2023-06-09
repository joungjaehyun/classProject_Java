package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodo;
import todo.util.ConnectionProvider;

public class TodoInsertService {
	
	TodoDAO dao;
	
	// 입력의 요청을 처리하는 메소드
	// RequestTodo 전달받고 Dao 메소드에 요청
	private TodoInsertService () {
		this.dao=TodoDAO.getInstance();
	}
	private static TodoInsertService service = new TodoInsertService();
	
	public static TodoInsertService getInstance() {
		return service;
	}
	public int register(RequestTodo todo) {
		Connection conn =null;
		int result = 0;
		
		try {
			conn= ConnectionProvider.getConnection();
			result = dao.insertTodo(conn, todo);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
