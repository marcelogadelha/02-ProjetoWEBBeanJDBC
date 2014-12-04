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
<%@ page import="br.com.projeto.web.model.Classe"%>
<%@	page import="java.util.Date"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucesso Scriptlet</title>
</head>
<body>

	sucesso
	<% //COMENTÁRIO %><!-- SCRIPTLET: COMENTÁRIO -->
	<% /*COMENTÁRIO*/ %><!-- SCRIPTLET: COMENTÁRIO -->
	<%! Classe classe=new Classe();%><!-- SCRIPTLET: ATRIBUTO, NECESSITOU DE page import="#" -->
	<%=classe.getNome() %><!-- SCRIPTLET: RESULTADO -->
	<%=new Date() %>
	<%@include file="/paginas/rodape.html" %><!-- NO CORPO DA PÁGINA -->

</body>
</html>