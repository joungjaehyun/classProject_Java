package person.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import person.domain.LoginDTO;
import person.service.LoginService;

@WebServlet("/login")
public class Login extends HttpServlet {

      LoginService service;
      
      public Login() {
    	  this.service = LoginService.getInstance();
      }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String viewPath ="/WEB-INF/views/person/login.jsp";
		
		request.getRequestDispatcher(viewPath).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String personID=request.getParameter("personID");
		String password = request.getParameter("password");
		String rePersonID = request.getParameter("rePersonID");
		LoginDTO loginPerson =null;
		
		HttpSession session = request.getSession();
		
		loginPerson = service.LoginService(personID, password);
		
		if (loginPerson!=null) {
			
			session.setAttribute("loginData", loginPerson);
			
			if (rePersonID!=null && rePersonID.equals("on")) {
				Cookie cookie = new Cookie("rePersonID", personID);
				cookie.setMaxAge(86400*180);
				cookie.setPath("/");
				response.addCookie(cookie);
			}else {
				Cookie cookie = new Cookie("rePersonID","");
				cookie.setMaxAge(0);
				cookie.setPath("/");
				response.addCookie(cookie);
				
			}
			response.sendRedirect("/todoapp/list");
		}else {
			response.sendRedirect("login");
		}
		
		
	}

}
