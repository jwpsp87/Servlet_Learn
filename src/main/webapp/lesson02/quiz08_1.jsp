<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교포문고</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>

<body>
	<%
	List<Map<String, Object>> list = new ArrayList<>();
	Map<String, Object> map = new HashMap<String, Object>() {
		{ 
			put("id", 1000);
			put("title", "아몬드"); 
			put("author", "손원평"); 
			put("publisher", "창비");
			put("image", "https://image.yes24.com/goods/37300128/XL");
		} 
	};
	list.add(map);
	map = new HashMap<String, Object>() {
        { 
            put("id", 1001);
            put("title", "사피엔스"); 
            put("author", "유발 하라리"); 
            put("publisher", "김영사");
            put("image", "https://i.namu.wiki/i/1p-2_Nfxf-6Nk1x3tPPIIUNpNWA3T5r6_3oKysRebZJtAg6uDSRwXEF0gXfDwHhtR44oMomj-_-u6A98zLOL7A.webp");
        } 
    };
    list.add(map);

    map = new HashMap<String, Object>() {
        { 
            put("id", 1002);
            put("title", "코스모스"); 
            put("author", "칼 세이건"); 
            put("publisher", "사이언스북");
            put("image", "https://image.aladin.co.kr/product/24219/13/cover500/scm4015919350928.jpg");
        } 
    };
    list.add(map);

    map = new HashMap<String, Object>() {
        { 
            put("id", 1003);
            put("title", "나미야 잡화점의 기적"); 
            put("author", "히가시노 게이고"); 
            put("publisher", "현대문학");
            put("image", "https://upload.wikimedia.org/wikipedia/ko/4/4f/%EB%82%98%EB%AF%B8%EC%95%BC%EC%9E%A1%ED%99%94%EC%A0%90%EC%9D%98%EA%B8%B0%EC%A0%81_%ED%91%9C%EC%A7%80.jpg");
        } 
    };
    list.add(map);
	
	%>
	
	<%
		 // 테이블에 보여줄 책정보(target) 뽑아내기
		int id = Integer.parseInt(request.getParameter("id"));
		Map<String, Object> target = new HashMap<>();
			for (Map<String, Object> item : list) {
				if ((Integer) item.get("id") == id) {
					target = item;
					break;
			}
		}
	
	%>
	
	<div class="container">
		<div class="d-flex">
			<div>
				<img src="<%=target.get("image")%>" width="300">
			</div>
		
			<div class="ml-3">
				<span class="display-1 font-weight-bold d-block"><%= target.get("title") %></span>
				<span class="display-3 text-info d-block"><%= target.get("author")%></span>
				<span class="display-4 text-secondary d-block"><%= target.get("publisher") %></span>
			</div>
		</div>
	
	
	
	</div>



</body>
</html>