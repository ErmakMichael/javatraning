package by.itacademy.jd1.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Resource3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		Cookie myCookie1 = new Cookie("testcookie1", "cookieValue1");
		Cookie myCookie2 = new Cookie("testcookie2", "cookieValue2");
		Cookie myCookie3 = new Cookie("testcookie3", "cookieValue3");
		
		HttpSession session = req.getSession();
		session.setAttribute("autorized",Boolean.TRUE);
		
		
		myCookie1.setMaxAge(24 * 60 * 600);
		resp.addCookie(myCookie1);
		
		myCookie2.setMaxAge(24 * 60 * 6);
		resp.addCookie(myCookie2);
		
		myCookie3.setMaxAge(24 * 60);
		resp.addCookie(myCookie3);

	}

}