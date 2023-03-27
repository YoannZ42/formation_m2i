

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/step2")
public class Step2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http://localhost:8080/<votre nom de projet>/step1?login=java&password=jee
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Login :" + login + "    password :" + password);
		
		response.getWriter().write("Login :" + login + "    password :" + password );
		
		
	}
}