package com.xworkz.movie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/movie.dosa",loadOnStartup = 1)
public class MovieList extends HttpServlet {

	public MovieList() {
		System.out.println("Movies list ");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String lang = req.getParameter("lang");
		String director = req.getParameter("director");
		String producer = req.getParameter("producer");
		String budget = req.getParameter("budget");
		String date = req.getParameter("release");
		
		System.out.println("Movie Name: "+name);
		System.out.println("Language: "+lang);
		System.out.println("Director: "+director);
		System.out.println("Producer: "+producer);
		System.out.println("Budget: "+budget);
		System.out.println("Release Date: "+date);
		System.out.println();
		
		req.setAttribute(name, producer);
		RequestDispatcher dispatcher= req.getRequestDispatcher("seaon.jsp");
		dispatcher.forward(req, resp);
		
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "	<meta charset=\"ISO-8859-1\">\r\n"
				+ "	<title>Movie Mania</title>\r\n"
				+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "	<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\r\n"
				+ "		<div class=\"container-fluid\">\r\n"
				+ "			<a class=\"navbar-brand\" href=\"#\">Movie Mania</a>\r\n"
				+ "			<ul class=\" navbar-nav nav justify-content-end\">\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link\" href=\"index.html\">Home</a>\r\n"
				+ "				</li>\r\n"
				+ "				<li class=\"nav-item\">\r\n"
				+ "					<a class=\"nav-link\" href=\"movies.html\">Movies</a>\r\n"
				+ "				</li>\r\n"
				+ "			</ul>\r\n"
				+ "		</div>\r\n"
				+ "	</nav>"
				+ "	<div class=\"container\">\r\n"
				+ "		<h1>Movie Details Submitted</h1>\r\n"
				+ "		<br>"
				+ "		<h3>Movie Name: "+name
				+ "		<h3>Language : "+lang
				+ "		<h3>Director : "+director
				+ "		<h3>Producer : "+producer
				+ "		<h3>Budget : "+budget
				+ "		<h3>Release Date : "+date
				+ "</div>"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
	}
}
