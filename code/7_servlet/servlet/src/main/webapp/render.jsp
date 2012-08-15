<%@ page import="java.util.List" %>
<html>
<head></head>
<body>
<%
    List<String> result = (List<String>) request.getAttribute("result");
    for (String s : result) {
        out.println(s + "<br/>");
    }
%>
</body>
</html>