package firstWeb.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form/input")
public class InputServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		// 사용자 요청의 한글 처리 (받기전에 리퀘스트에 해줘야됨)
		request.setCharacterEncoding("utf-8");
		
		// 내용 입력데이터 받기
		// textarea
		String content = request.getParameter("content");
		System.out.println("content : " + content);
		
		// radio
		String gender = request.getParameter("gender");
		System.out.println("gender : " +gender);
		
		
		// checkbox
		String [] langs = request.getParameterValues("lang");
		for(String lang : langs) {
			System.out.println(lang);
		}
		// select 
		String birthYear = request.getParameter("birthyear");
		System.out.println(birthYear);
		
		// number
		String parmaAge = request.getParameter("age");
		int age = Integer.parseInt(parmaAge);
		if (age>19) {
			// 성인이 접속 가능한 페이지
		} else {
			// 미성년자가 접속 가능한 페이지
		}
		// date
		String birth = request.getParameter("birth");
		
		System.out.println("birth : " + birth);
		
		response.setContentType("text/html; charset=UTF-8");
		
		

		PrintWriter out = response.getWriter();
		out.println("<h3> content : " + content +"</h3>");
		out.println("<h3> gender : " + gender +"</h3>");
		out.println("<h3> Interest </h3>");
		for (String lang : langs) { 
			out.println(" - " + lang +"<br>");
			
		}
		out.println("<h3> birthyear : " + birthYear +"</h3>"); 
		out.println("<h3> age : " + age + "</h3>");
		out.println("<h3> birth : " + birth + "</h3>");
		out.close();
	} 

}
