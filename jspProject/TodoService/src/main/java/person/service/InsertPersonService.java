package person.service;

import java.sql.Connection;
import java.sql.SQLException;

import person.dao.PersonDAO;
import person.domain.PersonDTO;
import util.ConnectionProvider;

public class InsertPersonService {

	PersonDAO dao;
	
	private InsertPersonService() {
		this.dao=PersonDAO.getInstance();
	}
	private static InsertPersonService service = new InsertPersonService();
	
	public static InsertPersonService getInstance() {
		return service;
	}
	
	public int InsertService(PersonDTO p) {
		
		int result =0;
		Connection conn = null;
		
		try {
			conn= ConnectionProvider.getConnection();
			result = dao.InsertPerson(conn, p);
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
