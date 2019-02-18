<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=utf-8"%>
<html>
<body>
<h2>Hello World!</h2>
<h2>测试-成功页面！</h2>

<%
    int cols,rows;  //列、行
    out.println("<table border='1'>");
    for(cols=1;cols<10;cols++){
        out.println("<tr>");
        for(rows=1;rows<=cols;rows++){
            out.println("<td>"+cols+"*"+rows+"="+cols*rows+"</td>");
        }
        out.println("</tr>");
    }

    out.println("</table>");
%>
<%
    String date=new String("日期");
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-DD HH:mm:ss:SS");
    String result=sdf.format(new Date());
    out.println(result);
%>
</body>
</html>
