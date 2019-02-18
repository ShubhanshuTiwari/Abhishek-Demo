package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeaderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// super.doGet(req, resp);

		PrintWriter out = response.getWriter();

		out.println("<HTML>");

		out.println("<head><title>");
		out.println("My first web page using servlet!");
		out.println("</title></head>");

		out.println("<body>");

		out.println("<h1>");
		out.print(new Date());

		out.println("</h1>");
		out.println("<table border=\1\">");
		String headerName = null, headerValues = null;
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			headerName = headerNames.nextElement();
			headerValues = request.getHeader(headerName);
			out.println("<tr>");
			out.println("<td>");
			out.println(headerName);
			out.println("</td>");
			out.println("<td>");
			out.println(headerValues);
			out.println("</td>");
			out.println("</tr>");

		}
		out.println("</table>");

		out.println("</body>");

		out.println("</HTML>");

	}

}
