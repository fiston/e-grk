<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
    <title><tiles:insertAttribute name="title" ignore="true" /></title>
    <!-- Bootstrap core CSS -->
    <link href="/styles/css/bootstrap.css" rel="stylesheet">
    <!-- Add custom CSS here -->
    <link href="/styles/css/sb-admin.css" rel="stylesheet">
    <link rel="stylesheet" href="/styles/font-awesome/css/font-awesome.min.css">
    <%--<script type="text/javascript" src="js/sivalabs.js"></script>--%>
</head>
<body>

<table border="1" style="border-collapse: collapse;" cellpadding="2" cellspacing="2" align="center" width="800">    <tbody><tr>
    <td height="30" colspan="2"><tiles:insertAttribute name="header" /></td>
</tr>
<tr>
    <td width="150" height="450" valign="top">

        <tiles:insertAttribute name="navigation" />

    </td>
    <td valign="top" width="650">

        <tiles:insertAttribute name="body" />

    </td>
</tr>
<tr>
    <td height="30" colspan="2">

        <tiles:insertAttribute name="footer" />

    </td>
</tr>
</tbody></table></body>
</html>