<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>


    <script>
        function b1() {
            $.post({
              url:"${pageContext.request.contextPath}/b1",
              data:{"name":$("#username").val()},
              success:function (data) {
                  if ("ok"===data) {
                        $("#content1").css("color","green");
                    }else {
                      $("#content1").css("color","red");
                  }
                  $("#content1").html(data)
              }
            });
        }

        function b2() {
            $.post({
                url:"${pageContext.request.contextPath}/b1",
                data:{"pwd":$("#password").val()},
                success:function (data) {
                    if ("ok"===data) {
                        $("#content2").css("color","green");
                    }else {
                        $("#content2").css("color","red");
                    }
                    $("#content2").html(data)
                }
            });
        }
    </script>

</head>
<body>



      用户名：<input type="text" id="username" onblur="b1()">
      <span id="content1"></span>

      <br>
      密 码：<input type="password" id="password" onblur="b2()">
      <span id="content2"></span>


</body>
</html>
