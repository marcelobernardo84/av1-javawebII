<%-- 
    Document   : cadastro_fornecedor
    Created on : 11/09/2015, 15:40:41
    Author     : marcelo
--%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Fornecedor:</h1>
        <s:form action="cadastroFornecedor" method="post">
            <s:textfield name="nome" label="Nome"/>
            <s:submit value="Enviar"/>
        </s:form>
    </body>
</html>
