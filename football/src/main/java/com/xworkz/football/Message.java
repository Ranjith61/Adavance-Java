package com.xworkz.football;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/message")

public class Message extends HttpServlet {
	public Message() {
		System.out.println("Invoking the message");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking do get in message");
		String name = req.getParameter("name");
		String msg = req.getParameter("msg");
		System.out.println("Name : " + name);
		System.out.println("Message : " + msg);

		resp.setContentType("text/html");

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("This is my first response...");
	}

}
