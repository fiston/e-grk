<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
	background-color: silver;
}
</style>
<title><spring:message code="girinka.home" /></title>
<link href="<c:url value='styles/rabhome.css'/>" type="text/css" rel="stylesheet" />
</head>
<body>
<div id="main">
<div id="data"><spring:message code="girinka.home" /></div>
<form:form commandName="source" method="post">
	<table>
		
		<tr>
			<td><spring:message code="girinka.source.name" />:</td>
			<td><form:input path="sourceName" /></td>
		</tr>
                <tr>
			<td><spring:message code="girinka.description" />:</td>
			<td><form:input path="description" /></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="<spring:message code="girinka.save" />"></td>
		</tr>
	</table>
</form:form>

</div>
</body>
</html>