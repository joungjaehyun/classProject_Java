package todo.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import todo.dao.TodoDAO;
import todo.domain.TodoDTO;
import util.ConnectionProvider;

public class ListService {

	TodoDAO dao;
	
	private ListService() {
		this.dao = TodoDAO.getInstance();
	}
	private static ListService service = new ListService();
	
	public static ListService getInstance() {
		return service;
	}
	
	public List<TodoDTO> getList(String personID){
		
		Connection conn =null;
		List<TodoDTO> list = new ArrayList<>();
		
		try {
			conn= ConnectionProvider.getConnection();
			list= dao.allListByID(conn, personID);
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
		
		return list;
	}
	
}
