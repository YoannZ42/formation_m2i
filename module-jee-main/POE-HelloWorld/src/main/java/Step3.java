

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/step3")
public class Step3 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//http://localhost:8080/<votre nom de projet>/step1?login=java&password=jee
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if (login == null || password == null) {
			
				response.setStatus(500);
				
		}else {
			System.out.println("Login :" + login + "    password :" + password);
		
			HttpSession session = request.getSession(true);
			
			session.setAttribute("loginAttribute", login);
			session.setAttribute("passwordAttribute", password);
			
			request.getRequestDispatcher("step3.jsp").forward(request, response);
			
		}		
	}
}
