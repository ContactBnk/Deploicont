package com.formation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {
		PrintWriter consoleServlet = reponse.getWriter();
		consoleServlet = reponse.getWriter();
		consoleServlet.println(" Servlet à Nono");
	}

	protected void doPost(HttpServletRequest requete, HttpServletResponse reponse) throws ServletException, IOException {
		doGet( requete, reponse );
	}

}
