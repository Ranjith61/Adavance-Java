package com.xworkz.grocery.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.repository.GroceryRepository;
import com.xworkz.grocery.repository.GroceryRepositoryImpl;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;
import com.xworkz.grocerydto.GroceryDTO;

@WebServlet(urlPatterns = { "/grocery", "/total" ,"/view"}, loadOnStartup = 1)
public class GroceryController extends HttpServlet {
	private GroceryRepository groceryRepository = new GroceryRepositoryImpl();
	private GroceryService groceryService = new GroceryServiceImpl(groceryRepository);

	public GroceryController() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in grocery servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in groceryservlet");
		String name = req.getParameter("name");
		Double price = Double.parseDouble(req.getParameter("price"));
		String type = req.getParameter("type");
		Double quantity = Double.parseDouble(req.getParameter("quantity"));

		System.out.println("Name:" + name);
		System.out.println("Type: " + type);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);

		req.setAttribute("Key1", name);
		req.setAttribute("Key3", type);
		req.setAttribute("Key2", price);
		req.setAttribute("Key4", quantity);

		GroceryDTO dto = new GroceryDTO(name, price, type, quantity);

		boolean save = groceryService.validateAndSave(dto);
		System.out.println("saved= " + save);
		req.setAttribute("total", this.groceryService.total());

		RequestDispatcher dispatcher = req.getRequestDispatcher("grocery.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in GroceryController");
		String uri = req.getRequestURI();
		System.out.println("URI is " + uri);
		if (uri.endsWith("/total")) {
			req.setAttribute("total", this.groceryService.total());
			req.getRequestDispatcher("grocery.jsp").forward(req, resp);
		} else if (uri.endsWith("/view")) {
			req.setAttribute("group", this.groceryService.getall());
			req.getRequestDispatcher("groceryview.jsp").forward(req, resp);
		}

		
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Productservlet");
		super.destroy();
	}

}
