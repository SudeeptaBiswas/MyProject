<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
    <head>
        <title>This is form Title</title>
        <style>
            .error {
                color: #ff0000;
                font-style: italic;
            }
        </style>
    </head>
    <body>
        <form:form method="POST" commandName="signUp">
            <table>
                <tr>
                    <td>User Name :</td>
                    <td><form:input path="name" /></td>
                    <%--<td><form:errors path="name" cssClass="error" /></td>--%>
                </tr>
                <tr>
                    <td>Password :</td>
                    <td><form:password path="password" /></td>
                    <%--<td><form:errors path="password" cssClass="error" /></td>--%>
                </tr>
                <%--<tr>--%>
                    <%--<td>Confirm Password :</td>--%>
                    <%--<td><form:password path="password" /></td>--%>
                <%--</tr>--%>
                <tr>
                    <td>email :</td>
                    <td><form:input path="email"/></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit"></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>