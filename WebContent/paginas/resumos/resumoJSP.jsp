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
<!--
	page
	extends="br.com.projeto.classe"
	input="index.html"
-->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resumo: JSP</title>
</head>
<body>

	<!-- REDIRECIONAMENTO -->
	<jsp:forward page="index.html">
		<jsp:param value="" name="login"/>
		<jsp:param value="" name="senha"/>
	</jsp:forward>
	
	<!-- BEAN -->
	<jsp:useBean id="classe" class="br.com.projeto.web.model.Classe" scope="page"></jsp:useBean><!-- SCOPE: PAGE, REQUEST, SESSION, APPLICATION -->
	<jsp:setProperty property="nome" name="classe" value="Marcelo Gadelha"/>
	<jsp:setProperty property="*" name="classe" value=""/><!-- USA-SE * EM VEZ DOS NOMES DOS ATRIBUTOS, SE OS MESMOS POSSUIREM NOMES IGUAIS NO ARQUIVO HTML -->
	<jsp:getProperty property="nome" name="classe"/>
	
	<!-- INCLUINDO PÁGINAS -->
	<jsp:include page="${pageContext.request.contextPath}/paginas/resumos/rodape.html">
		<jsp:param value="" name="nome"/>
	</jsp:include>

	<!-- OBJETOS IMPLÍCITOS -->
	response.setHeader("nome1","valor")
	request.getAttribute()
	session.getAttribute("")
	config
	application
	page
	pageContext
	exception
	out.print
	out.println
	out.write

</body>
</html>