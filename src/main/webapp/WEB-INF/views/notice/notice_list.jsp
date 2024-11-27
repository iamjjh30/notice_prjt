<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>


<html>
<head>
<meta charset=UTF-8">
<title>코드 그룹 출력창</title>
</head>
<body>
<table border="1"  align="center"  width="80%">
    <tr align="center"   bgcolor="aqua">
      <td><b>번호</b></td>
      <td><b>카테고리</b></td>
      <td><b>종류</b></td>
      <td><b>이름</b></td>
      <td><b>등록일자</b></td>
      <td><b>업데이트일자</b></td>
      <td><b>상태</b></td>
   </tr>

 <c:forEach var="noticeGroup" items="${codeGroupList}" >
   <tr align="center">
      <td>${noticeGroup.n_idx}</td>
      <td>${noticeGroup.n_category}</td>
      <td>${noticeGroup.n_title}</td>
      <td>${noticeGroup.n_content}</td>
      <td>${noticeGroup.n_regdate}</td>
      <td>${noticeGroup.n_update}</td>
      <td>${noticeGroup.n_status}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>