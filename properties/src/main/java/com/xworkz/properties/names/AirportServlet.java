package com.xworkz.properties.names;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/idli", loadOnStartup = 1)
public class AirportServlet extends HttpServlet {

	public AirportServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in Airport Servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in Airport Servlet");
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String type = req.getParameter("type");
		String city = req.getParameter("city");
		String capacity = req.getParameter("capacity");
		String width = req.getParameter("width");
		String totalTerminal = req.getParameter("totalTerminal");
		String openDate = req.getParameter("openDate");
		String operational = req.getParameter("operational");
		String inaguratedBy = req.getParameter("inaguratedBy");
	

		System.out.println("Airport Name:" + name);
		System.out.println("Country: " + country);
		System.out.println("Type: " + type);
		System.out.println("City: " + city);
		System.out.println("Capacity: " + capacity);
		System.out.println("width: " + width);
		System.out.println("Total Terminals: " + totalTerminal);
		System.out.println("Open Date: " + openDate);
		System.out.println("Operational: " + operational);
		System.out.println("InaguratedBy: " + inaguratedBy);
		




		req.setAttribute("Key1", name);
		req.setAttribute("Key2", country);
		req.setAttribute("Key3", type);
		req.setAttribute("Key4", city);
		req.setAttribute("Key5", capacity);
		req.setAttribute("Key6", width);
		req.setAttribute("Key7", totalTerminal);
		req.setAttribute("Key8", openDate);
		req.setAttribute("Key9", operational);
		req.setAttribute("Key10", inaguratedBy);
	
	
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("airportsuccess.jsp");
		dispatcher.forward(req, resp); // 
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Airport Servlet");
		super.destroy();
	}

}
