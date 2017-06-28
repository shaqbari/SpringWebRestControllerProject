<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html >
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>

</script>
</head>
<body>
<!-- 
	input.do(요청) ==> input_ok.do(처리) ==> output.do
	화면이동: forward(URL유지 => 화면만 변경) request가유지된다.
				 redirect(URL변경 => 화면변경) request초기화된다.(GET방식이라 id password감출수 없다.)
				 		output.do?id=admin&pwd=1234
				 		노출안하고 보낼수 있는 방법 1)ajax
				 											  2)RedirectAttributes
				 				 							  
	@Controller =>리턴형 : JSP파일명/redirect: .do
	@RestController(@Controller+@ResponseBody) => 리턴형 : 스크립트 문자열만 보낼때만 쓴다.
		이동 => 2개이상일때 쓴다.
		
	
	
 -->
	<center>
		<form action="input_ok.do" method="post">
			이름:<input type="text" name="name" size="12"/><br />
			성별:<input type="radio" name="sex" value="남자" checked="checked"/>남자
			<input type="radio" name="sex" value="여자"/>여자<br />
			<input type="submit" value="전송" />
		</form>
	</center>
</body>
</html>