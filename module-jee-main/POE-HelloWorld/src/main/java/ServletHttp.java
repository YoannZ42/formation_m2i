

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlethttp")
public class ServletHttp extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String password = request.getParameter("password");

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		if ( password != null ) {
			response.setStatus(201);
			response.getWriter().append("<h1>Password recived</h1>");
		}
		else
		{
			response.setStatus(500);
			response.getWriter().append("<h1>Missing password</h1>");
		}
	}

}
