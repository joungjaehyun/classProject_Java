package person.service;

import java.sql.Connection;
import java.sql.SQLException;

import person.domain.LoginDTO;
import person.dao.PersonDAO;
import util.ConnectionProvider;

public class LoginService {

	PersonDAO dao;
	
	private LoginService() {
		this.dao= PersonDAO.getInstance();
	}
	private static LoginService service = new LoginService();
	
	public static LoginService getInstance() {
		return service;
	
	}
	
	public LoginDTO LoginService(String personID,String password) {
		
		LoginDTO person= null;
		Connection conn =null;
		try {
			conn=ConnectionProvider.getConnection();
			person = dao.loginPerson(conn, personID, password);
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
 		
		return person;
	}
	
	
}
