package com.jee.controllers.tag;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HeaderTag extends TagSupport{
	
	private static final long serialVersionUID = -5724539588672386069L;
	
	private String name;
	private String profil;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setProfil(String profil) {
		this.profil = profil;
	}
	
	public String getProfil() {
		return profil;
	}
	
	@Override
	public int doStartTag() {
		
		JspWriter out = pageContext.getOut();
		
		
		System.out.println(name + "    " + profil);
		
		
		try {
			if (name != null && !"".equals(name)) {
				out.println("<h4> Welcome back "+ name + "</h4>");
			}
			out.println("<p>Start Tag </p>"
					+ ""
					+ ""
					+ "<a href='/home'>Home</a>"
					+ "<a href='/product' >Product</a>"
					+ "<a href='/contact' >Contact</a>"
					+ ""
					+ ""
					+ "");
			if (profil != null) {
				out.println( "<a href='"+ profil +"' >Profil</a>");
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 2;
	}
	
	@Override
	public int doEndTag() {
		JspWriter out = pageContext.getOut();

		try {
			out.println("<p>End Tag </p>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		return 4;
		
	}
	
	
}
