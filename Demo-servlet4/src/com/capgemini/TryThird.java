package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TryThird extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
				
		out.println("<head><title>");
		out.println("My first web page using servlet!");
		out.println("</title></head>");

		
		out.println("<body>");
		
		out.println("<h1>");
		
		out.println("My first web page using servlet!");
		
		out.println("</h1>");
		out.println("</body>");
		
		
		out.println("</HTML>");
	}
	
	
	
	
}
