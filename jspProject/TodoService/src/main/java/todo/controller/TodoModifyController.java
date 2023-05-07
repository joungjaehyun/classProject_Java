package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.domain.TodoDTO;
import todo.service.DetailService;
import todo.service.ModifyService;


@WebServlet("/modify")
public class TodoModifyController extends HttpServlet {

	ModifyService service;
	DetailService detailService;
	
	public TodoModifyController() {
		this.service = ModifyService.getInstance();
		this.detailService=DetailService.getInstance();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String personID =request.getParameter("personID");
		String noTodoNum = request.getParameter("todoNum");
		int todoNum = Integer.parseInt(noTodoNum);
		
		TodoDTO todo = detailService.getTodo(personID, todoNum);
		
		request.setAttribute("todo", todo);
		
		request.getRequestDispatcher("/WEB-INF/views/todo/modify.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String todoNumStr = request.getParameter("todoNum");
		int todoNum=Integer.parseInt(todoNumStr);
		String personID= request.getParameter("personID");
		String duedate =request.getParameter("duedate");
		String finished =request.getParameter("finished");
		String title =request.getParameter("title");
		TodoDTO todo = new TodoDTO(todoNum, title, duedate, (finished != null ?( finished.equals("on")? true: false):false), personID);
		
		int result = service.modifyService(todo);
	
		if (result >0) {
			response.sendRedirect("list");
		}
	
	}

}
