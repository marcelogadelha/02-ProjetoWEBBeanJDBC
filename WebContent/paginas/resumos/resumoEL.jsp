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
	COMPARA��O:		==|eq, !=|ne, <|lt, >|gt, <=|le, >=|ge
	L�GICO:			&&|and, || |or, !|not
	OUTROS:			(), empty, [], .
	ARITM�TICOS:	+, -, *, /, div, %, mod
	-->
	<!-- #{} ou ${} -->
	
	<!-- OBJETOS IMPL�CITOS EM EXPRESSION LANGUAGE -->
	${requestScope}<!-- VARI�VEIS DO ESCOPO DA REQUISI��O -->
	${pageScope}<!-- VARI�VEIS DO ESCOPO DA P�GINA -->
	${sessionScope}<!-- VARI�VEIS DO ESCOPO DA SE��O -->
	${aplicationScope}<!-- VARI�VEIS DO ESCOPO DA APLICA��O -->
	
	${cookie}<!-- COOKIE -->
	
	${header}<!-- UM CABE�ALHO ESPEC�FICO -->
	${headerValues}<!-- ARRAY COM VALORES -->
	
	${initParam}
	${param}<!-- PAR�METRO COM UM S� VALOR -->
	${param.nome}<!-- DECLARA��O DA VARI�VEL NOME -->
	
	<!-- EM JSP -->
	<jsp:useBean id="classe" class="br.com.projeto.web.model.Classe" scope="page"></jsp:useBean>
	<!-- EM EXPRESSION LANGUAGE -->
	${jbean.nome}
	
	${paramValues}<!-- PAR�METRO MULTIVALORADO -->
	
	${pageContext.request.requestURI}<!-- CAPTURAR A PR�PRIA URI -->
	${pageContext.request.method}<!-- CAPTURAR O PR�PRIO M�TODO -->

</body>
</html>