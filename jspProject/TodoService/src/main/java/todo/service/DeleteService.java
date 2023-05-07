package todo.service;

import java.sql.Connection;
import java.sql.SQLException;

import todo.dao.TodoDAO;
import util.ConnectionProvider;

public class DeleteService {

	TodoDAO dao;
	private DeleteService() {
		this.dao=TodoDAO.getInstance();
	}
	private static DeleteService service = new DeleteService();
	
	public static DeleteService getInstance() {
		return service;
	}
	
	public int deleteService(int todoNum) {
		Connection conn =null;
		int result= 0;
		
		try {
			conn=ConnectionProvider.getConnection();
			result =dao.deleteTodo(conn, todoNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
