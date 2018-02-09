package by.itacademy.jd1.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Resource1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();

		writer.println("<h1>");
		writer.println("Hello i a resourse");
		writer.println("</h1>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		String isActive = req.getParameter("isActive");
		String fio = req.getParameter("fio");
		String data = req.getParameter("data");
		
		
		
	PrintWriter writer = resp.getWriter();
		writer.println(String.format("data was saved on server.isActive=%s, fio=%s", isActive, fio));
	
	}

}
