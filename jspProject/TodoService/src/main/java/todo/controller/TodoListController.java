package todo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import person.domain.LoginDTO;
import person.domain.PersonDTO;
import todo.domain.TodoDTO;
import todo.service.ListService;


@WebServlet("/list")
public class TodoListController extends HttpServlet {

	ListService service;
	
	public TodoListController() {
		this.service =ListService.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session =  request.getSession();
		LoginDTO person= (LoginDTO)session.getAttribute("loginData");
		List<TodoDTO> list =service.getList(person.getPersonID());
		
		
		request.setAttribute("todoList", list);
		String viewPath="/WEB-INF/views/todo/list.jsp";
		
		request.getRequestDispatcher(viewPath).forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
