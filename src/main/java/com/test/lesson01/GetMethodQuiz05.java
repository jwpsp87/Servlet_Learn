package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz05")
public class GetMethodQuiz05 extends HttpServlet {

	 @Override
	public void doGet(HttpServletRequest request, 
					  HttpServletResponse response) throws IOException {
		 
		 response.setContentType("text/html");
		 response.setCharacterEncoding("utf-8");
		 
//		 int dan = Integer.parseInt(request.getParameter("number"));
		 int dan = Integer.valueOf(request.getParameter("number"));
		 
		 PrintWriter out = response.getWriter();
		 
		 out.print("<html><head><title>구구단</title></head><body>");
		 out.print("<ul>");
			 for (int x=1; x<=9; x++) {
				 out.print("<li>"+ dan+ " X "+  x+ " = "+ (dan*x)+ "</li>");
			 }	 
		 out.print("</ul></body></html>");
		 
		 
	 }
	
	
}
