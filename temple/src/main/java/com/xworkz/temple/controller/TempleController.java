package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;

@WebServlet(urlPatterns = { "/temple", "/total", "/view" }, loadOnStartup = 1)
public class TempleController extends HttpServlet {
	private TempleRepository templeRepository = new TempleRepositoryImpl();
	private TempleService templeService = new TempleServiceImpl(templeRepository);

	public TempleController() {
		System.out.println("No-arg const");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service in temple servlet");
		super.service(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in templeservlet");
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String mainGod = req.getParameter("mainGod");
		int constructedYear = Integer.parseInt(req.getParameter("constructedYear"));
		String constructedBy = req.getParameter("constructedBy");

		System.out.println("Name:" + name);
		System.out.println("place: " + place);
		System.out.println("mainGod: " + mainGod);
		System.out.println("constructedYear: " + constructedYear);
		System.out.println("constructedBy: " + constructedBy);

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", place);
		req.setAttribute("Key3", mainGod);
		req.setAttribute("Key4", constructedYear);
		req.setAttribute("Key5", constructedBy);

		TempleDTO dto = new TempleDTO(name, place, mainGod, constructedYear, constructedBy);

		boolean save = templeService.validateAndSave(dto);
		System.out.println("saved= " + save);
		req.setAttribute("total", this.templeService.total());

		RequestDispatcher dispatcher = req.getRequestDispatcher("templesuccess.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget in TempleController");
		String uri = req.getRequestURI();
		System.out.println("URI is " + uri);
		if (uri.endsWith("/total")) {
			req.setAttribute("total", this.templeService.total());
			req.getRequestDispatcher("/temple.jsp").forward(req, resp);
		} else if (uri.endsWith("/view")) {
			System.out.println(this.templeService.getall());
			req.setAttribute("group", this.templeService.getall());
			
			req.getRequestDispatcher("/templeview.jsp").forward(req, resp);
		}

	}

	@Override
	public void destroy() {
		System.out.println("Destroy in Productservlet");
		super.destroy();
	}

}
