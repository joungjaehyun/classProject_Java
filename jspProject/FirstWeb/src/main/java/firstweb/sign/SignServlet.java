package firstweb.sign;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignServlet
 */
@WebServlet( "/sign" )
public class SignServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		System.out.println("name : "  + name);
		
		String userId = request.getParameter("userid");
		System.out.println("userid : "  + userId);
		
		String password = request.getParameter("password");
		System.out.println("password : " + password);
		
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();	
		out.println("<h2> Name : " + name +"</h2>");
		out.println("<h2> ID : " + userId +"</h2>");
		out.println("<h2> Password : " + password +"</h2>");
		
		
	}

}
