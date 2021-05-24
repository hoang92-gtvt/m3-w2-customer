<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/24/2021
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ShowCustomer</title>
</head>
<body>
<div>
    <table border="1" style="border: solid">
        <caption>Danh Sách Khách Hàng</caption>
        <tr>
            <th>STT</th>
            <th>Tên</th>
            <th>Ngày Sinh</th>
            <th>Địa Chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach var="item" items="${customerList}" varStatus="loop">
            <tr>
                <td>${loop.index+1}</td>
                <td>${item.name}</td>
                <td>${item.brithday}</td>
                <td>${item.address}</td>
                <td><img src="${item.urlOfImage}" width="150" height="150"></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>

