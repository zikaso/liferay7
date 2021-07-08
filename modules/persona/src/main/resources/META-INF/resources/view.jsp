<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="persona.caption"/></b>
</p>

<portlet:actionURL name="addPersona" var="addPersonaURL"/>

<aui:form action="${addPersonaURL}" method="post">
<aui:input name="firstName" lable="Frist name"/>
<aui:input name="lastName" lable="Last name"/>
<aui:input name="age" lable="age"/>
<aui:button type="submit" value="ADD"/>
</aui:form>