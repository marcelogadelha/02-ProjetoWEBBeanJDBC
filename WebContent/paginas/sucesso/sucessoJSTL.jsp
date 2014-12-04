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
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><!-- JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%><!-- JSTL -->

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sucesso: JSP Standard Tag Library</title>
</head>
<body>

	<!-- JSTL CORE: Java Standard Tag Library Core-->
	<!-- @taglib uri prefix -->
	<c:remove var=""/>
	<c:catch></c:catch><!-- var -->
	<c:out value=""></c:out>
	<c:if test=""></c:if>
	<c:choose>
		<c:when test=""></c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
	<c:forTokens items="" delims=""></c:forTokens><!-- begin end stop -->
	<!-- REDIRECIONAMENTO -->
	<c:redirect></c:redirect><!-- url -->
	<c:url>
		<c:param name=""></c:param><!-- value -->
		<c:param name=""></c:param><!-- value -->
	</c:url>
	
	<!-- c:forEach --><!-- itens OU begin end OPCIONALMENTE step -->
	 
	<c:import url="index.html"></c:import><!-- var scope charEncoding context -->

</body>
</html>