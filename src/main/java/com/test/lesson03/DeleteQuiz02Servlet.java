package com.test.lesson03;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson03/quiz02_delete")
public class DeleteQuiz02Servlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request,
					   HttpServletResponse response) {
		
		 // id param
		int id = Integer.parseInt(request.getParameter("id"));
		
		 // db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		 // delete 쿼리
		String deleteQuery = "DELETE FROM `bookmark` WHERE id ="+ id;
		
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		 // db 연결 해제
		ms.disconnect();
		
		 // 목록 화면 이동 - redirect
		try {
			response.sendRedirect("/lesson03/quiz02_list.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
