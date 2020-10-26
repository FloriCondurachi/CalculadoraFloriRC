<%-- 
    Document   : error.jsp
    Created on : 19-oct-2020, 17:11:22
    Author     : Flori
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <p>ERROR<%=request.getAttribute("error")%></p>
    </body>
</html>
