package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_insert")
public class InsertQuiz02Servlet extends HttpServlet{

	
	@Override
	public void doPost(HttpServletRequest request,
					   HttpServletResponse response) {
		
		 // 파라미터
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		 // db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();	// DB 연결
		
		 // insert
		String insertQuery = "INSERT INTO `bookmark` (`name`, `url`, `createdAt`, `updatedAt`)"
						   + "VALUES('"+ name+ "','"+ url+ "',NOW(),NOW())";
		
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 // db 연결 해제
		ms.disconnect();
		
		 // 목록 화면으로 이동 - redirect
		try {
			response.sendRedirect("/lesson03/quiz02_list.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
