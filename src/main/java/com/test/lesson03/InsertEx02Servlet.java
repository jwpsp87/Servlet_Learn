package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/insert-ex02")
public class InsertEx02Servlet extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request,
					   HttpServletResponse response) {
		
		 // response header 세팅 생략
		
		
		 // request params
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		 // db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		 // db insert
		String insertQuery = "INSERT INTO `new_user`"
					       + "(`name`, `yyyymmdd`, `email`, `introduce`)"
					       + "VALUES"
					       + "('"+ name+ "', '"+ yyyymmdd+ "', '"+ email+ "', '"+ introduce+ "')";
					       
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}			       
		
		 // db 연결 해제
		ms.disconnect();
		
		 // 유저 목록화면 이동
		try {
			response.sendRedirect("/lesson03/ex02_user.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
