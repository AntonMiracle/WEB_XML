<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/WEB-INF/tag/tld/MyTagDescriptor.tld" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world

<%--<tag:MyTagName paramNameJspTag="settingParamValue"/>--%> <%-- нужно установить в MyTagDescriptor.tld  <body-content>empty</body-content> --%>
<tag:MyTagName paramNameJspTag="settingParamValue">Body of MyTagName</tag:MyTagName> <%-- ято бы тело тега отобрабадось нужно указать в MyTagDescriptor.tld  <body-content>scriptless</body-content> --%>
</body>
</html>
