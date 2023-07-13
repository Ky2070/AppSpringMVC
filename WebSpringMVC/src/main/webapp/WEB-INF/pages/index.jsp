<%-- 
    Document   : index
    Created on : Jul 13, 2023, 2:50:15 PM
    Author     : Kiet
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <<ul>
            <c:forEach items="${products}" var="p">
                <<li>${p.id} - ${p.name} - ${p.price}</li>
            </c:forEach>
        </ul>

    </body>
</html>