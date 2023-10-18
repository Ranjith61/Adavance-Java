package com.xworkz.food.runner;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vada", loadOnStartup = 1)
public class FoodServlet extends HttpServlet {

	public FoodServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in Food Servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in Food Servlet");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String hotelName = req.getParameter("HotelName");
		String price = req.getParameter("price");
		String quantity = req.getParameter("quantity");

		

	    int pricee = Integer.parseInt(price);
	    int quantityy = Integer.parseInt(quantity);
	    int total = 0;
	    
	    if (pricee>0) {
	    	total = pricee*quantityy;
		}
	    
	    
		System.out.println("Airport Name:" + name);
		System.out.println("Type: " + type);
		System.out.println("HotelName: " + hotelName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);

		req.setAttribute("Key1", name);
		req.setAttribute("Key3", type);
		req.setAttribute("Key4", hotelName);
		req.setAttribute("Key5", price);
		req.setAttribute("Key6", quantity);

		RequestDispatcher dispatcher = req.getRequestDispatcher("foodsuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Food Servlet");
		super.destroy();
	}

}
