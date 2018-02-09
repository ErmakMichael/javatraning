package by.itacademy.jd1.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Resource4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cookieName = "testCookie";
		String cookieValue = "";

		Cookie[] myCookie = req.getCookies();

		if (myCookie != null) {

			for (int i = 0; i < myCookie.length; i++) {
				Cookie cookie = myCookie[i];
				if (cookieName.equals(cookie.getName())) {
					cookieValue = cookie.getValue();
					break;
				}
			}
		
		}
		resp.getWriter().println("I got the cookie" + cookieValue);

		Boolean isAutorized = (Boolean) req.getSession().getAttribute("autorized");
		if (isAutorized != null && isAutorized) {
			resp.getWriter().println("you are loggen in");
		} else {
			resp.getWriter().println("you are anonymos");

		}

		resp.getWriter().println("I got the cookie" + cookieValue);

	}

}