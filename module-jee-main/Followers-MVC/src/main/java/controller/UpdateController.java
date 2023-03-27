package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Characters;
import services.CharacterService;


@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	CharacterService service;
    public UpdateController() {
        super();
        service = new CharacterService();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = -1;
		try {
			id = Integer.parseInt( request.getParameter("id"));			
		} catch (Exception e) {
		}
		
		Characters c = service.getOne(id);
		
		request.setAttribute("character", c);
		
		request.getRequestDispatcher("UpdateView.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
						
			int id = Integer.parseInt( request.getParameter("id"));
			String name = request.getParameter("txtName");
			String type = request.getParameter("txtType");
			int size = Integer.parseInt( request.getParameter("txtSize"));
			int level = Integer.parseInt( request.getParameter("txtLevel"));
			
			Characters c = new Characters(id, name, level, size, type);
			service.update(c);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/show").forward(request, response);
		
	}

}
