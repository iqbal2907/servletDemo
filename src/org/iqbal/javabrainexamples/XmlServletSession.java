package org.iqbal.javabrainexamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServletSession extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method of XmlServletSession executed");
		resp.setContentType("text/html");
		String userName = req.getParameter("username");
		PrintWriter pr = resp.getWriter();
		HttpSession session = req.getSession();
		if (userName != "" && userName != null) {
			session.setAttribute("username", userName);
		}
		pr.println("UserName in req.getParameter() is : " + userName);
		pr.println("UserName in session.getAttribute() is : " + session.getAttribute("username"));
	}

}
