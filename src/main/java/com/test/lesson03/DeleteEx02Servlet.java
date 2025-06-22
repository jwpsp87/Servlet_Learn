package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/delete-ex02")
public class DeleteEx02Servlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,
					  HttpServletResponse response) {
		
		 // response 헤더 생략
		 
		 // request parameter => id
		int id = Integer.parseInt(request.getParameter("id")); 
		
		 // DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		 // db delete
		String deleteQuery = "DELETE FROM `new_user` WHERE `id` ="+ id;
	
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 // DB 연결 해제
		ms.disconnect();
		
		 // 사용자 목록 화면 이동 => Redirect 302
		try {
			response.sendRedirect("/lesson03/ex02_user.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
