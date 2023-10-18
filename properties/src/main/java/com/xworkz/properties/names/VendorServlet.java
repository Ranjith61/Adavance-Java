package com.xworkz.properties.names;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/biriyani", loadOnStartup = 1)
public class VendorServlet extends HttpServlet {

	public VendorServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in Product servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in Vendor Servlet");
		String name = req.getParameter("name");
		String gst = req.getParameter("gst");
		String owner = req.getParameter("owner");
		String location = req.getParameter("location");

		System.out.println("Name:" + name);
		System.out.println("GST: " + gst);
		System.out.println("Owner: " + owner);
		System.out.println("Location: " + location);




		req.setAttribute("Key1", name);
		req.setAttribute("Key2", gst);
		req.setAttribute("Key3", owner);
		req.setAttribute("Key4", location);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("vendorsuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Vendor Servlet");
		super.destroy();
	}

}
