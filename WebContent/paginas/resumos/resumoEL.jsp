<%@ page
	info="Desenvolvido por Marcelo Gadelha"
	language="java"
	session="true"
	buffer="10kb"
	autoFlush="true"
	isErrorPage="false"
	errorPage="paginas/erros/erro.jsp"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resumo: Expression Language</title>
</head>
<body>

	<!--
	COMPARAÇÃO:		==|eq, !=|ne, <|lt, >|gt, <=|le, >=|ge
	LÓGICO:			&&|and, || |or, !|not
	OUTROS:			(), empty, [], .
	ARITMÉTICOS:	+, -, *, /, div, %, mod
	-->
	<!-- #{} ou ${} -->
	
	<!-- OBJETOS IMPLÍCITOS EM EXPRESSION LANGUAGE -->
	${requestScope}<!-- VARIÁVEIS DO ESCOPO DA REQUISIÇÃO -->
	${pageScope}<!-- VARIÁVEIS DO ESCOPO DA PÁGINA -->
	${sessionScope}<!-- VARIÁVEIS DO ESCOPO DA SEÇÃO -->
	${aplicationScope}<!-- VARIÁVEIS DO ESCOPO DA APLICAÇÃO -->
	
	${cookie}<!-- COOKIE -->
	
	${header}<!-- UM CABEÇALHO ESPECÍFICO -->
	${headerValues}<!-- ARRAY COM VALORES -->
	
	${initParam}
	${param}<!-- PARÂMETRO COM UM SÓ VALOR -->
	${param.nome}<!-- DECLARAÇÃO DA VARIÁVEL NOME -->
	
	<!-- EM JSP -->
	<jsp:useBean id="classe" class="br.com.projeto.web.model.Classe" scope="page"></jsp:useBean>
	<!-- EM EXPRESSION LANGUAGE -->
	${jbean.nome}
	
	${paramValues}<!-- PARÂMETRO MULTIVALORADO -->
	
	${pageContext.request.requestURI}<!-- CAPTURAR A PRÓPRIA URI -->
	${pageContext.request.method}<!-- CAPTURAR O PRÓPRIO MÉTODO -->

</body>
</html>