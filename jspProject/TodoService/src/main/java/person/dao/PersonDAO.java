package person.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import person.domain.PersonDTO;
import person.domain.LoginDTO;

public class PersonDAO {

	private PersonDAO() {}
	private static PersonDAO dao = new PersonDAO();
	public static PersonDAO getInstance() {
		return dao;
	}
	
	
	public int InsertPerson(Connection conn, PersonDTO p) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into person (firstName,lastName,personID,password) "
				+ "values(?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getFirstName());
			pstmt.setString(2, p.getLastName());
			pstmt.setString(3, p.getPersonID());
			pstmt.setString(4, p.getPassword());
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
	public LoginDTO loginPerson(Connection conn, String personID,String password) {
		
		LoginDTO person = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		String sql ="select firstName,lastName,personID from person where personID=? and password=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, personID);
			pstmt.setString(2, password);
			rs= pstmt.executeQuery();
			
			if (rs.next()) {
				person = new LoginDTO(rs.getString("firstName"), rs.getString("lastName"), rs.getString("personID"));		
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return person;
	}
}
