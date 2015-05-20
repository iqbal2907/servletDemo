package org.iqbal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from doGet method of XmlServlet");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("Hello "+request.getParameter("username"));
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost method of XmlServlet executed");
		response.setContentType("text/html");
		String userName = request.getParameter("username");
		String fullName = request.getParameter("fullname");
		String prof = request.getParameter("prof");
		String[] loc = request.getParameterValues("location");
		PrintWriter pw = response.getWriter();
		pw.println("Hello "+userName);
		pw.println("Your fullname is : "+fullName);
		pw.println("You are a : "+prof);
		for (int i = 0; i < loc.length; i++) {
			pw.println("You are from "+i+" : "+loc[i]);
		}
	}

}
