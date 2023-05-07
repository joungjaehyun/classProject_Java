package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.DetailService;

@WebServlet("/read")
public class TodoReadController extends HttpServlet {

	DetailService service;
	
	public TodoReadController ( ) {
		this.service=DetailService.getInstance();
	}
	
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		String personID =request.getParameter("personID");
		String noTodoNum = request.getParameter("todoNum");
		int todoNum = Integer.parseInt(noTodoNum);
		
		TodoDTO todo = service.getTodo(personID, todoNum);
		
		request.setAttribute("todo", todo);
		
		request.getRequestDispatcher("/WEB-INF/views/todo/read.jsp").forward(request, response);
	}

}
