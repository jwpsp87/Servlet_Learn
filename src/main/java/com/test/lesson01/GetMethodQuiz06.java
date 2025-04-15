package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {

	 @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		 response.setContentType("text/json");
		 response.setCharacterEncoding("utf-8");
		 
		 PrintWriter out = response.getWriter();
		 
		 int num1 = Integer.parseInt(request.getParameter("number1"));
		 int num2 = Integer.valueOf(request.getParameter("number2"));
		 
		 int add = num1 + num2;
		 int min = num1 - num2;
		 int mul = num1 * num2;
		 int div = num1/num2;
		 
		 out.print("{\"addition\":"+ add+", \"substraction\":"+ min+ 
				   ", \"multiplication\":"+ mul+ ", \"division\":"+ div+ "}");
 
	 }
	
}
