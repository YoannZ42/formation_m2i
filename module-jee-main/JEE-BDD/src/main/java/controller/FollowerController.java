package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import entity.Follower;
import services.FollowersService;


@WebServlet("/follower")
public class FollowerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	FollowersService service;
	
    public FollowerController() {
        super();
        service = new FollowersService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//GET : http://localhost:8080/JEE-BDD/follower?id=2
		//GET : http://localhost:8080/JEE-BDD/follower
		
		String json = "";
		
		try {
			int id = Integer.parseInt( request.getParameter("id") );
			// Return one
			json = new Gson().toJson(service.getById(id));
			
		} catch (Exception e) {
			// Return all
			json = new Gson().toJson(service.getAll().toArray());
		}
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST : http://localhost:8080/JEE-BDD/follower?name=toto&age=15
		
		try {
			String name = request.getParameter("name");
			int age = Integer.parseInt( request.getParameter("age"));
			Follower f = new Follower(age, name);
			service.add(f);
			
			response.setStatus(201);
			
		} catch (NumberFormatException e) {
			response.setStatus(400);
		}		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PUT : http://localhost:8080/JEE-BDD/follower?name=toto&age=15&id=2
		try {
			String name = request.getParameter("name");
			int age = Integer.parseInt( request.getParameter("age"));
			int id = Integer.parseInt( request.getParameter("id"));			
			
			Follower f = new Follower(id, age, name);
			
			service.update(f);
			
			response.setStatus(200);
			
		} catch (NumberFormatException e) {
			response.setStatus(400);
		}

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DELETE : http://localhost:8080/JEE-BDD/follower?id=2
		try {
			int id = Integer.parseInt( request.getParameter("id"));
			service.delete(id);
			
			response.setStatus(200);
		} catch (Exception e) {
			response.setStatus(400);
		}
	}

}
