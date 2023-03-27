import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/helloworld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// public private protected
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
			
		try {
			PrintWriter out = response.getWriter();
			
			
			
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "	<head>\r\n"
					+ "	<meta charset=\"ISO-8859-1\">\r\n"
					+ "		<title>Insert title here</title>\r\n"
					+ "	</head>\r\n"
					+ "	\r\n"
					+ "	<body>\r\n"
					+ "		<h1>Login page</h1>\r\n"
					+ "		\r\n"
					+ "		<form action=\"helloworld\" method=\"POST\">\r\n"
					+ "			<label for=\"txtLogin\">Login</label>\r\n"
					+ "			<input name=\"txtLogin\" type=\"text\"><br>\r\n"
					+ "\r\n"
					+ "			<label for=\"txtPassword\">Password</label>\r\n"
					+ "			<input name=\"txtPassword\" type=\"password\"><br>\r\n"
					+ "			\r\n"
					+ "			<input name=\"btnConnect\" type=\"submit\">\r\n"
					+ "		</form>\r\n"
					+ "	</body>\r\n"
					+ "</html>\r\n"
					+ "");
		} catch (Exception e) {
			System.out.println("Error in doGet :" + e.toString());
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		try( PrintWriter out = response.getWriter() ){
			
			if ("titi".equals(login) && "toto".equals(password)) {
				out.println("Ok");
			}else{
				out.println("Password incorect");			
			}
			
		}
	}
}
