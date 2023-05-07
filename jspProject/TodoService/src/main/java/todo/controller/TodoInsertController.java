package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.RequestTodoDTO;
import todo.service.InsertService;

@WebServlet("/register")
public class TodoInsertController extends HttpServlet {
	InsertService service;
	public TodoInsertController() {
		this.service=InsertService.getInstance();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			request.getRequestDispatcher("/WEB-INF/views/todo/insert.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = request.getParameter("title");
		String duedate = request.getParameter("duedate");
		String personID = request.getParameter("personID");
		RequestTodoDTO todo = new RequestTodoDTO(title, duedate, personID);
		
		int result = service.insertService(todo);
		if (result >0) {
			response.sendRedirect("list");
		}
	}

}
