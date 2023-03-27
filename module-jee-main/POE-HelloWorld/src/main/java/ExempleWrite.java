

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExempleWrite
 */
@WebServlet("/exemplewrite")
public class ExempleWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// http://localhost:8080/<nom du projet>/exemplewrite?login=jee
		
		String login = request.getParameter("login");
		System.out.println(login);
		
		response.getWriter().write("Bonjour :" + login);
	}
}



