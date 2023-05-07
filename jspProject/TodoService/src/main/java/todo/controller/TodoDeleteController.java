package todo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.service.DeleteService;


@WebServlet("/delete")
public class TodoDeleteController extends HttpServlet {

	DeleteService service;
	
	public TodoDeleteController() {
		this.service=DeleteService.getInstance();
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String noStr = request.getParameter("no");
		int no = Integer.parseInt(noStr);
		int result =service.deleteService(no);
		
		if (result >0) {
			response.sendRedirect("list");
		}
	}

}
