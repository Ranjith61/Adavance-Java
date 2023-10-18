package com.xworkz.properties.names;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/runner", loadOnStartup = 1)
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in Product servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in productservlet");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String type = req.getParameter("type");
		String quantity = req.getParameter("quantity");

		System.out.println("Name:" + name);
		System.out.println("Price: " + price);
		System.out.println("Type: " + type);
		System.out.println("Quantity: " + quantity);




		req.setAttribute("Key1", name);
		req.setAttribute("Key2", price);
		req.setAttribute("Key3", type);
		req.setAttribute("Key4", quantity);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("productsuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Productservlet");
		super.destroy();
	}

}
