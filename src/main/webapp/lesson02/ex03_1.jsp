<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST Method - 결과</title>



</head>

<body>
	<%
		String nickname = request.getParameter("nickname");
		String hobby = request.getParameter("hobby");
		String animal = request.getParameter("animal");
		String[] foodArr = request.getParameterValues("food");
		String fruit = request.getParameter("fruit");
	%>

	<table border="1">
		<tr>
			<th>별명</th>
			<td><%= nickname %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%= hobby %></td>
		</tr>
		<tr>
			<th>선호하는 동물</th>
			<td><%= animal %></td>
		</tr>
		<tr>
			<th>선호하는 음식</th>
			<td>
				<%
					// 일반 for문 | 향상된 for문
				String result = ""; 
				  if (foodArr != null) {	// 선택 항목 없을 시 배열이 null
					for (String food : foodArr) {
						result += food + ",";					   
					}	  
				  }
				     // 마지막 ,(콤마) 제거
				     // abc => ab 추출 substring(0, 2) 2 => 3 - 1
				   result = result.substring(0, result.length() - 1);
				   out.print(result);
				%>
			</td>
		</tr>
		<tr>
			<th>선호하는 과일</th>
			<td><%= fruit %></td>
		</tr>
	
	
	</table>



</body>
</html>