<%-- 
    Document   : resultado.jsp
    Created on : 19-oct-2020, 17:11:12
    Author     : Flori
--%>

<%@page import="es.albarregas.beans.calculador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        <%
            calculador calculador= (calculador) request.getAttribute("calcular");
            %>
            <p> <%=calculador.getOperador1()%><%=calculador.setSigno()%>
            <%=calculador.getOperador2()%>=<%=calculador.getResultado()%></p>
    </body>
</html>
