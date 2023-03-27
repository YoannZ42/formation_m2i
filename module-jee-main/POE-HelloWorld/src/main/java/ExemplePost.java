

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExemplePost
 */
@WebServlet("/exemplepost")
public class ExemplePost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * GET : Récupérer
	 * POST : Ajouter
	 * PUT : Modifier
	 * DELETE : Supprimer
	 */
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("inDoPost");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("inDoGet");
	}
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("inDoPut");
	}
}
