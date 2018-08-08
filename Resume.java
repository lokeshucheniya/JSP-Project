package com.cg.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.pojo.Person;

@WebServlet("/Res")
public class Resume extends HttpServlet {

	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("Wassup");
		Person person = new Person(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("gender"), request.getParameter("highestQualification"), request.getParameter("dateOfBirth"), request.getParameterValues("hobies"), request.getParameter("address"), request.getParameterValues("check"), request.getParameter("email"), request.getParameter("web"),request.getParameter("number"), request.getParameter("description"));
		
		request.setAttribute("PersonObj", person);
		
		RequestDispatcher rd=request.getRequestDispatcher("Person2.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
