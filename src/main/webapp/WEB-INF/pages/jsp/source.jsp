<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div id="main">
    <div id="data"><spring:message code="source.home"/></div>
    <form:form commandName="source" method="post" modelAttribute="source" action="/admin/source/add">
        <table>

            <tr>
                <td><spring:message code="source.name"/>:</td>
                <td><form:input path="sourceName"/></td>
            </tr>
            <tr>
                <td><spring:message code="source.description"/>:</td>
                <td><form:input path="description"/></td>
            </tr>
            <tr>
                <td><spring:message code="source.program"/>:</td>
                <td><form:select path="programs" items="${programList}"/></td>
            </tr>
            <tr>
                <td><spring:message code="source.createdBy"/>:</td>
                <td><form:select path="createdBy" items="${creator}"/></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="<spring:message code="source.save" />"></td>
            </tr>
        </table>
    </form:form>

</div>
<div>
    <h1>List of Sources</h1>

    <p>Here you can see the list of the Sources, edit them or update.</p>
    <table border="1px" cellpadding="0" cellspacing="0">
        <thead>
        <tr>
            <th width="10%">id</th>
            <th width="15%">name</th>
            <th width="25%">Description</th>
            <th width="10%">Programs</th>
            <th width="10%">Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="resource" items="${sourceList}">
            <tr>
                <td>${resource.idSource}</td>
                <td>${resource.sourceName}</td>
                <td>${resource.description}</td>
                <td>
                    <c:forEach var="program" items="${resource.programs}">
                        ${program.description}
                    </c:forEach>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/admin/source/edit?id=${resource.idSource}">Edit</a><br/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <p><a href="${pageContext.request.contextPath}/index">Home page</a></p>


</div>
