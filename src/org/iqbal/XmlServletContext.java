package org.iqbal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/hello", initParams = { @WebInitParam(name = "foo", value = "Hello ") })
public class XmlServletContext extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method of XmlServletContext executed");
		resp.setContentType("text/html");
		String userName = req.getParameter("username");
		PrintWriter pr = resp.getWriter();
		HttpSession session = req.getSession();
		ServletContext context = req.getServletContext();
		if (userName != "" && userName != null) {
			session.setAttribute("username", userName);
			context.setAttribute("username", userName);
		}
		pr.println("UserName in req.getParameter() is : " + userName);
		pr.println("UserName in session.getAttribute() is : " + session.getAttribute("username"));
		pr.println("UserName in context.setAttribute() is : " + context.getAttribute("username"));
		pr.println("UserName in getServletConfig().getInitParameter() is : " + getInitParameter("defaultUser"));

	}
}
