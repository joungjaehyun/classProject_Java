package person.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import person.domain.PersonDTO;
import person.service.InsertPersonService;


@WebServlet("/signUp")
public class InsertPersonController extends HttpServlet {
	
	InsertPersonService service;
	
	public InsertPersonController() {
		this.service = InsertPersonService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String viewPath="/WEB-INF/views/person/signUpForm.jsp";
		
		request.getRequestDispatcher(viewPath).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int result = 0;
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String personID = request.getParameter("personID");
		String password = request.getParameter("password");
		
		PersonDTO insertPerson = new PersonDTO(firstName, lastName, personID, password);
		
		result = service.InsertService(insertPerson);
		
		if (result > 0) {
			System.out.println("입력 성공");
			
		}else {
			System.out.println("입력 실패 적절한 값을 입력해주세요");
		}
	
		response.sendRedirect("home.jsp");
	}

}
