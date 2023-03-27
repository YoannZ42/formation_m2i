

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/exemplejsp")
public class ExempleJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("username", name);
		// request.setAttribute("username", name);
		
		
		
		System.out.println(name);
		request.getRequestDispatcher("monJsp.jsp").forward(request, response);
		
		
	}

}
