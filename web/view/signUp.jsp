<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 12.07.2022
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Faculties Project</title>
</head>
<style>
    <%@include file="/view/assets/css/sign.css"%>
</style>
<body>
<div class="container">
    <div class="form">
        <div class="header">
            <a href="signIn.jsp" class="link" >Вход</a>
            <a href="" class="link">Регистрация</a>
        </div>

        <div class="input_form">
            <input type="text" placeholder="Имя" name="name" >
        </div>
        <div class="input_form">
            <input type="text" placeholder="Фамилия" name="surName" >
        </div>
        <div class="input_form">
            <input type="text" placeholder="Отчество" name="lastName" >
        </div>
        <div class="input_form">
            <input type="text" placeholder="Логин" name="login" >
        </div>
        <div class="input_form">
            <input class="password-input" type="password" id="password-input" placeholder="Пароль" name="password">
            <img id="password-control" class="password-control" src="assets/image/sign/eye2.png" alt="">
        </div>
        <button class="btn_reg">Регистрация</button>
    </div>
</div>
</body>
<script>
    let seePassword = false;
    let switcher = document.getElementById("password-control");
    let passwordInput = document.getElementById("password-input");
    switcher.addEventListener("click", ()=> {
        seePassword = !seePassword;
        if(seePassword) {
            switcher.setAttribute('src',"../view/assets/image/sign/eye1.png")
            passwordInput.setAttribute('type', 'text');
        }
        else {
            switcher.setAttribute('src',"../view/assets/image/sign/eye2.png")
            passwordInput.setAttribute('type', 'password');
        }
    })
</script>
</html>
