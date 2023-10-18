package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/season", loadOnStartup = 1)
public class SeasonServlet extends HttpServlet {

	public SeasonServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in season servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in seasonservlet");
		String country = req.getParameter("country");
		String season = req.getParameter("season");

		System.out.println("country:" + country);
		System.out.println("Season: " + season);

		req.setAttribute("Key1", country);
		req.setAttribute("Key2", season);
		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Seasonservlet");
		super.destroy();
	}

}
