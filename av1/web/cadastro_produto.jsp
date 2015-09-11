<%-- 
    Document   : cadastro_produto
    Created on : 11/09/2015, 12:28:33
    Author     : marcelo
--%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Produtos</title>
    </head>
    <body>
        <h1>Produtos:</h1>
        <s:form action="cadastroProduto" method="post">
            <s:textfield name="campo1" label="Campo1:"/>
            <s:textfield name="campo2" label="Campo2:"/>
            <s:textfield name="campo3" label="Campo3:"/>
            <s:textfield name="campo4" label="Campo4:"/>
            <s:select label="Fornecedor" 
		headerKey="-1" headerValue="Select Fornecedor"
		list="buscaFornecedor" 
		name="listaBuscaFornecedor"/>
            <s:submit value="Enviar"/>
        </s:form>
    </body>
</html>
