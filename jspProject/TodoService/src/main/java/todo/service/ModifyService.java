package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import util.ConnectionProvider;

public class ModifyService {

	TodoDAO dao;
	private ModifyService() {
		this.dao=TodoDAO.getInstance();
	}
	private static ModifyService service = new ModifyService();
	
	public static ModifyService getInstance() {
		return service;
	}
	
	public int modifyService (TodoDTO todo) {
		int result =0;
		Connection conn =null;
		
		try {
			conn= ConnectionProvider.getConnection();
			result = dao.updateTodo(conn, todo);
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
