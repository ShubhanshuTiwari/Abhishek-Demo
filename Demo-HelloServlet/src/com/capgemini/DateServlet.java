package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/getTime")
public class DateServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		super.doGet(req, resp);
		
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
				
		out.println("<head><title>");
		out.println("My first web page using servlet!");
		out.println("</title></head>");

		
		out.println("<body>");
		
		out.println("<h1>");
		
		out.print(new Date());
		
		out.println("</h1>");
		out.println("</body>");
		
		
		out.println("</HTML>");
		
	}
}
