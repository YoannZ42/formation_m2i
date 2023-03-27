

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Signin")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("SigninView.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmation = request.getParameter("confirmation");
		
		boolean erreur = false;
		String firstNameError = "";
		String lastNameError = "";
		String emailError = "";
		String passwordError = "";
		String confirmationError = "";
		
		if (firstname == null || "".equals(firstname)) {
			erreur = true;
			firstNameError = "first name not fill";
		}
		if (lastname == null || "".equals(lastname)) {
			erreur = true;
			lastNameError = "last name not fill";
		}
		if( email == null || !email.contains("@")) {
			erreur = true;
			emailError = "email does not contain '@'";
		}
		if (password == null || password.length() < 8) {
			passwordError = "Password length < 8";
			erreur = true;
		}
		if (confirmation == null || !confirmation.equals(password) || "".equals(confirmation)) {
			erreur = true;
			confirmationError = "confirmation and password not equals";
		}

		
		HttpSession session = request.getSession(true);
		
		if (erreur) {
			session.setAttribute("firstname", firstname);
			session.setAttribute("lastname", lastname);
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			session.setAttribute("confirmation", confirmation);
			
			session.setAttribute("firstNameError", firstNameError);
			session.setAttribute("lastNameError", lastNameError);
			session.setAttribute("emailError", emailError);
			session.setAttribute("passwordError", passwordError);
			session.setAttribute("confirmationError", confirmationError);

			doGet(request, response);			
		} else {
			session.setAttribute("firstName", firstname);
			session.setAttribute("lastName", lastname);
			request.getRequestDispatcher("WelcomeView.jsp").forward(request, response);
		}
		
		
		
	}

}
