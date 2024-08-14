<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>
로그인 입력 파라미터 출력
</h1>

<%
    String userid = request.getParameter("userid");
    String passward = request.getParameter("passward");
    String strAge = request.getParameter("age");
    int age = strAge!= null ? Integer.parseInt(strAge) : -1;
    // 별건 아니지만 개발자들이 껄끄러워함 우리는 이런 원리를알고있어야한다는데
    // 뭐 어떤원리를 말하는건지잘모르겠다 .
%>

아이디값 : <% = userid %> <br>
비밀번호 : <% = Password %> <br>
나이 : <% = age%>

</body>
</html>
