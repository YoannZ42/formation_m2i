

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExempleForm
 */
@WebServlet("/exempleform")
public class ExempleForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In DoGet");
				
		request.getRequestDispatcher("exampleform.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		System.out.println("Login :" + login + "\nPassword :" + password);
		
		if ("tata".equals(login) && "toto".equals(password)) {
			response.getWriter().append("OK");
		} else {
			response.getWriter().write("KO");
		}
		
	}
}
