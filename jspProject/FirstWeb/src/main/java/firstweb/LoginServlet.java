package firstweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				///////////////////////
				// 사용자 요청 처리

		String userId = request.getParameter("userid");
		System.out.println(" id : " + userId);

		String password = request.getParameter("password");
		System.out.println(" PW : " + password);

				//////////////////////
				// 응답

		PrintWriter out = response.getWriter();

		out.println(" id : " + userId);
		out.println(" PW : " + password);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		///////////////////////
		// 사용자 요청 처리

		String userId = request.getParameter("userid");
		System.out.println("사용자 입력 id : " + userId);

		String password = request.getParameter("password");
		System.out.println("사용자 입력 PW : " + password);

		//////////////////////
		// 응답

		PrintWriter out = response.getWriter();

		out.println("사용자 입력 id : " + userId);
		out.println("사용자 입력 PW : " + password);
		out.close();
	}

}
