<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>첵 생성하기</title>
</head>
<body>
    <h1>책 생성하기</h1>
    <form method="post">
      <p>제목 : <input type="text" name="title" value="${data.title}"/></p>
      <p>카테고리 :  <input type="text" name="category" value="${data.category}"/></p>
      <p>가격 : <input type="text" name="price" value="${data.parice}"/></p>
      <p><input type="submit" value="저장">
    </form>

</body>
</html>
