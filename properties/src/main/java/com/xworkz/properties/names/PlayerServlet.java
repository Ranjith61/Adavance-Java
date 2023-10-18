package com.xworkz.properties.names;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/players", loadOnStartup = 1)
public class PlayerServlet extends HttpServlet {

	public PlayerServlet() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in Player Servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in Player Servlet");
		String name = req.getParameter("name");
		String sport = req.getParameter("sport");
		String jersyNo = req.getParameter("jersyNo");
		String country = req.getParameter("country");
		String dob = req.getParameter("dob");
		String married = req.getParameter("married");
		String captainName = req.getParameter("captainName");
		String coachName = req.getParameter("coachName");
		String gender = req.getParameter("gender");
		String age = req.getParameter("age");
		String wife = req.getParameter("wife");

		System.out.println("Name:" + name);
		System.out.println("Sport: " + sport);
		System.out.println("JersyNo: " + jersyNo);
		System.out.println("Country: " + country);
		System.out.println("DOB: " + dob);
		System.out.println("Married: " + married);
		System.out.println("CaptainName: " + captainName);
		System.out.println("coachName: " + coachName);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Wife: " + wife);




		req.setAttribute("Key1", name);
		req.setAttribute("Key2", sport);
		req.setAttribute("Key3", jersyNo);
		req.setAttribute("Key4", country);
		req.setAttribute("Key5", dob);
		req.setAttribute("Key6", married);
		req.setAttribute("Key7", captainName);
		req.setAttribute("Key8", coachName);
		req.setAttribute("Key9", gender);
		req.setAttribute("Key10", age);
		req.setAttribute("Key11", wife);
	
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("playersuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Player Servlet");
		super.destroy();
	}

}
