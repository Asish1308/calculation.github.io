package com.calculation.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculation.models.AddNumbers;


@WebServlet("/add")
public class AddNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddNumberServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	AddNumbers add = new AddNumbers();
	int result = add.addNumbers(num1, num2);
	
	request.setAttribute("result", "Addition value = "+result);
	
	RequestDispatcher rd = request.getRequestDispatcher("add.jsp");
	rd.include(request, response);
	}

}
