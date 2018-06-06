<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" uri="/WEB-INF/tld/MyTagDescriptor.tld" %> <%-- tld папка не может находится внутри tags папки --%>
<%@ taglib prefix="jsptag" tagdir="/WEB-INF/tags" %> <%-- Подключаем таг. Важно что бы папка называлась "tags"--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world

<%--<tag:MyTagName paramNameJspTag="settingParamValue"/>--%> <%-- нужно установить в MyTagDescriptor.tld  <body-content>empty</body-content> --%>
<%--Создан используя Java.class--%>
<tag:MyTagName paramNameJspTag="settingParamValue">Body of MyTagName. Try to get value of TagAttName : ${TagAttName}.Try use function : ${tag:functionMinus(50,10)}
    <tag:InnerTag>Inner tag body</tag:InnerTag>
</tag:MyTagName> <%-- ято бы тело тега отобрабадось нужно указать в MyTagDescriptor.tld  <body-content>scriptless</body-content> --%>
<%--Создан используя  jsp страницу--%>
<jsptag:JspTag someAtt="valueSomeAtt">body of JspTag</jsptag:JspTag>
</body>
</html>
