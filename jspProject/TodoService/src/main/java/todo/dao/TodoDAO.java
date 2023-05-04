package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import todo.domain.TodoDTO;

public class TodoDAO {

	private TodoDAO() {}

	private static TodoDAO dao= new TodoDAO();
	
	public static TodoDAO getInstance() {
		return dao;
	}
	
	public List<TodoDTO> allListByID(Connection conn,String personID){
		
		List<TodoDTO> list =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from todo where personID=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, personID);
			rs= pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				list.add(makeList(rs));
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			if (rs!=null) {
				rs.close();
			}
			if (pstmt!=null) {
				pstmt.close();
			}}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		return list;
	}

	
	private TodoDTO makeList(ResultSet rs) throws SQLException {
		
		return new TodoDTO(rs.getInt("todoNum"),rs.getString("title"), rs.getString("duedate"), rs.getBoolean("finished"), rs.getString("personID"));
	}
}
