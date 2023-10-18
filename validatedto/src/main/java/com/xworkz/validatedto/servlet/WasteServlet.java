package com.xworkz.validatedto.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.validatedto.DTO.WasteDTO;
import com.xworkz.validatedto.repository.WasteRepository;
import com.xworkz.validatedto.repository.WasteRepositoryImpl;
import com.xworkz.validatedto.service.WasteService;
import com.xworkz.validatedto.service.WasteServiceImpl;

@WebServlet(urlPatterns = "/save", loadOnStartup = 1)
public class WasteServlet extends HttpServlet {
	
	public WasteServlet(){
		System.out.println("Created WasteServlet..");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String weight = req.getParameter("weight");
		double convertedWeight = Double.parseDouble(weight);
		System.out.println("name" + name);
		
		// Creating Service

				WasteRepository repository = new WasteRepositoryImpl();
				WasteService service = new WasteServiceImpl(repository);
				WasteDTO dto = new WasteDTO(name, type, convertedWeight);
				boolean saved = service.validateAndSave(dto);
				if (saved) {
					System.out.println("Waste is Saved");
					req.setAttribute("msg","Waste is Saved");
				} else {
					System.out.println("Waste is not saved...");
					req.setAttribute("msg","Waste is not Saved");
				}

				RequestDispatcher dispatcher = req.getRequestDispatcher("WasteSuccess.jsp");
				dispatcher.forward(req, resp);// ?? Servelt Chain

		
	}

}
