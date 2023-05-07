package todo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import todo.domain.RequestTodoDTO;
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

	public TodoDTO selectByIDandNUM (Connection conn, String personID, int todoNum) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		TodoDTO todo = null;
		
		String sql = "select * from todo where personID=? and todoNum=?";
		
				try {
					pstmt=conn.prepareStatement(sql);
					pstmt.setString(1, personID);
					pstmt.setInt(2, todoNum);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						todo =makeList(rs);
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
					if (rs!=null) {
						rs.close();
					}
					if(pstmt!=null) {
						pstmt.close();
					}
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
				return todo;
		
	}
	
	
	
	private TodoDTO makeList(ResultSet rs) throws SQLException {
		
		return new TodoDTO(rs.getInt("todoNum"),rs.getString("title"), rs.getString("duedate"), rs.getBoolean("finished"), rs.getString("personID"));
	}
	
	public int insertTodo(Connection conn, RequestTodoDTO todo) {
		
			PreparedStatement pstmt =null;
			int result=0;
			
			String sql = "insert into todo (title,duedate,personID) values (?,?,?)";
			
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, todo.getTitle());
				pstmt.setString(2, todo.getDuedate());
				pstmt.setString(3, todo.getPersonID());
				result=pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (pstmt!=null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		return result;
		
	}
	
	public int updateTodo(Connection conn, TodoDTO todo) {
		PreparedStatement pstmt =null;
		int result =0;
		
		String sql="update todo set title=?, duedate=?, finished=? where todoNum=? and personID=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, todo.getTitle());
			pstmt.setString(2, todo.getDuedate());
			pstmt.setBoolean(3, todo.isFinished());
			pstmt.setInt(4, todo.getTodoNum());
			pstmt.setString(5, todo.getPersonID());
			result= pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
	public int deleteTodo(Connection conn, int todoNum) {
		PreparedStatement pstmt = null;
		int result =0;
		String sql = "delete from todo where todoNum=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, todoNum);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}
}
