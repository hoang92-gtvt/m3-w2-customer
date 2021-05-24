<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 5/24/2021
  Time: 8:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Customer List</title>
  </head>
  <body>
  <form action="/ServletCustomer" method="post">
      <h1>DANH SÁCH KHÁCH HÀNG </h1>
      <table border="1px" >
          <tr>
              <td>STT</td>
              <td>Tên</td>
              <td>Ngày sinh</td>
              <td>Địa chỉ</td>
              <td>Ảnh</td>
          </tr>
         </tr>

      </table>
      <button type="submit" >Show</button>
  </form>


  </body>
</html>
