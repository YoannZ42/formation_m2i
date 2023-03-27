

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		if (login == null) login = "";
		if (password == null) password = "";
		
		HttpSession s = request.getSession(true);
		s.setAttribute("password", password);
		s.setAttribute("login", login);
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("In do Post");
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		HttpSession s = request.getSession(true);
		s.setAttribute("password", password);
		s.setAttribute("login", login);
		
		
		if ( "java".equals(login) && "jee".equals(password)  ) {
			request.getRequestDispatcher("connected.jsp").forward(request, response);
		} else {
			doGet(request, response);			
		}
	}

}
