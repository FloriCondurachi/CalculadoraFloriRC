<%-- 
    Document   : index.jsp
    Created on : 19-oct-2020, 17:11:41
    Author     : Flori
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
        <link rel="stylesheet" href="../CSS/style.css">
    </head>
    <body>
        
        <div id="contenido">
            <table border="2">
         <form method="post" action="">
             
         <td>
             <div id="calc">CALCULADORA</div>
             <img src="../IMAGENES/calculadora.jpg"/>
         <br>
        Primer operador:<input type="text" id="operador1" name="operador1"/><br>
        Segundo operador:<input type="text" id="operador2" name="operador2"/><br>
        <br>
        <input type="radio" name="operacion" value="sumar" checked="checked"/>Sumar
        <input type="radio" name="operacion" value="restar"/>Restar
        <input type="radio" name="operacion" value="dividir"/>Dividir
        <input type="radio" name="operacion" value="multiplicar"/>Multiplicar
        <br>
        <br>
        <input type="submit" name="enviar" value="Calcular"/>
        <input type="submit" name="enviar" value="Recargar"/>
        <br>
        <br>
         </td> 
        </form> </table>
        </div>
    </body>
</html>
