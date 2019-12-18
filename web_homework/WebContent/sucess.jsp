<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作成功</title>
    <link rel="stylesheet" type="text/css" href="css/my.css">
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>

<table width="80%" border="0" align="center" cellpadding="0" cellspacing="5">
    <!--table 第一行-->
    <tr>
        <td height="94" colspan="2" align="center">
            <!-- 引入head.jsp -->
            <jsp:include flush="true" page="head.jsp"></jsp:include>
        </td>
    </tr>
    <!--table 第二行-->
    <tr>
        <td height="200" align="center">
            恭喜，操作成功！！<br>
            <a href="login.jsp">返回登陆</a>

        </td>
    </tr>
</table>
</body>
</html>
