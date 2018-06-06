<%@ attribute name="someAtt" required="false" %> <%-- required true  если он постоянно должен присутствовать--%>
Inside JspTag.tag <br/>
Print value of 'someAtt' : <%= someAtt%>
Try to get body of teg : <br/>
<% getJspBody().invoke(null); %>