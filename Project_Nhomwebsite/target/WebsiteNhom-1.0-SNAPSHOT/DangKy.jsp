<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/5/2021
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng Ký</title>
</head>
<body>
<form style="margin-top: -556px;" id="formdangnhap" onsubmit="return formdangnhap1()">
    <div class="dangnhap">

        <i id="close" class="fas fa-times-circle"></i>
        <h2>Đăng nhập</h2>
        <div class="tinh">
            <div class="trai">
                <p>Email/SĐT</p>
            </div>
            <div class="phai">
                <input type="text" id="email4" name="email" placeholder="Nhập Email hoặc Số điện thoại"
                       class="Input-sc-17i9bto-0 bYlDgr" value="">
                <p class="baoloi" id="message4"></p>
            </div>
        </div>
        <div class="tinh">
            <div class="trai">
                <p>Mật khẩu</p>
            </div>
            <div class="phai">
                <input type="password" id="email5" name="password" placeholder="Mật khẩu từ 6 đến 32 ký tự"
                       class="Input-sc-17i9bto-0 bYlDgr" value="">
                <p class="baoloi" id="message5"></p>
            </div>
        </div>
        <div class="quenmatkhau">

        </div>
</body>
</html>
