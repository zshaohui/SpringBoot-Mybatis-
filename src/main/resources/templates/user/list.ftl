<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表</title>
    <script src="${request.contextPath}/js/jquery.js"></script>
    <script>
        $(function(){
             $("#carId").click(function(){
                 alert("你想买这部车吗");
             })
        })
        
    </script>
</head>
<body>
SpringBoot+Mybatis+FreeMarker整合
欢迎你
<img id="carId" src="${request.contextPath}/imgs/1.jpg" width="300" height="300">
</body>
</html>