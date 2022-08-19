<%-- 
    Document   : admin-left
    Created on : 17 Aug 2022, 18:56:53
    Author     : nhatp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- A grey vertical navbar -->
<nav class="navbar bg-light">
    <!-- Links -->
    <ul class="navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="<c:url value="/admin/category-stats" />">Thong ke tan suat su dung thuoc</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Thong ke so luong benh nhan den kham</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Thong ke doanh thu</a>
        </li>
    </ul>
</nav>
