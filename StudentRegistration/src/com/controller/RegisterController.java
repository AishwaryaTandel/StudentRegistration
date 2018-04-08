package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.service.StudentService;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentId=request.getParameter("studentId");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		Student student= new Student(studentId,firstName,lastName,age,gender);
		boolean status=StudentService.registerStudent(student);
		System.out.println(status);
		
		if(status) {
			request.setAttribute("studentid", studentId);
			RequestDispatcher rd= request.getRequestDispatcher("RegisterSuccess.jsp");
			rd.forward(request,  response);			
		}
		else {
			response.sendRedirect("failure.jsp");
		}
	}
	
}
