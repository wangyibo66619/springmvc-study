<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>

    <script>
          function a() {
            $.post({
              url:"${pageContext.request.contextPath}/a1",
              data:{"name":$("#username").val()},
              success:function (data) {
                  alert(data);
              },
              error:function () {

              }
            })
          }
      
      

    </script>
  <body>

<%--    失去焦点的时候，发起一个请求到后台--%>
   用户名： <input type="text" id="username" onblur="a()">
  </body>
</html>
