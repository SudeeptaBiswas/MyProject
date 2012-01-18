<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
           prefix="dec" %>
<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><dec:title default="Web Page" /></title>
        <link rel="stylesheet" type="text/css" href="styles/style.css" />
        <dec:head />
    </head>
    <body>
        <!--body code-->
        <div id="bodyWrapper">
            <div id="header">
                <jsp:include page="/WEB-INF/jsp/header.jsp"></jsp:include>
                    <%--<%@ include file="/WEB-INF/jsp/header.jsp" %>--%>
            </div>
            <div id="pageBody">
                <div id="content">
                    <dec:body />
                </div>
            </div>

            <%@ include file="/WEB-INF/jsp/footer.jsp" %>
        </div>
    </body>
</html>