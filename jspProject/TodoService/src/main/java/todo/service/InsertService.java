package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.RequestTodoDTO;
import util.ConnectionProvider;

public class InsertService {

	TodoDAO dao;
	
	private InsertService() {
		this.dao=TodoDAO.getInstance();
	}
	private static InsertService service = new InsertService();
	
	public static InsertService getInstance() {
		return service;
	}
	
	public int insertService(RequestTodoDTO todo) {
		Connection conn =null;
		int result =0;
		try {
			conn = ConnectionProvider.getConnection();
			result = dao.insertTodo(conn, todo);
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
