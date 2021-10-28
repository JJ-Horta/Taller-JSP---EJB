<%-- 
    Document   : index
    Created on : 27/10/2021, 06:31:46 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora - JJHO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%String resultado = "";
            if (request.getAttribute("result") != null) {
                resultado = request.getAttribute("result") + "";
            }
        %>
        <p> Calculadora - JJHO </p>
        <form action="CalcServlet" method="POST">
            <div class="rows">
                <input type="text" name="a" />
                <input type="text" name="b"/>
                <a> = </a>
                <input type="text" name="result" value="<%=resultado%>" readonly/>
            </div>
            <div class="rows">
                <input class="input-button-basic" type="submit" name="calc" value="+">
                <input class="input-button-basic" type="submit" name="calc" value="-">
                <input class="input-button-advanced" type="submit" name="calc" value="%">
            </div>
            <div class="rows">
                <input class="input-button-basic" type="submit" name="calc" value="*">
                <input class="input-button-basic" type="submit" name="calc" value="/">
                <input class="input-button-basic" type="submit" name="calc" value="^">
            </div>
        </form>
    </body>
</html>
