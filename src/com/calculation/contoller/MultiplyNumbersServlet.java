package com.calculation.contoller;

import java.io.IOException;
import com.calculation.models.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/multiply")
public class MultiplyNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MultiplyNumbersServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	MultiplyNumbers multiply = new MultiplyNumbers();
	int result = multiply.multiplyNumbers(num1, num2);
	
	request.setAttribute("result", "Multiplication result= "+result);
	
	RequestDispatcher rd = request.getRequestDispatcher("multiplication.jsp");
	rd.include(request, response);
	
	}

}
