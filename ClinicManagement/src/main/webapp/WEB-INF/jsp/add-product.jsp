<%-- 
    Document   : add-product
    Created on : 18 Aug 2022, 22:40:18
    Author     : nhatp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<h1 class="text-center text-danger">THEM SAN PHAM</h1>
<c:url value="/admin/add-product" var="action"/>
<form:form method="post" action="action" modelAttribute="product" enctype="multipart/form-data">
    <div class="form-group">
        <label>Anh san pham</label>
        <form:input type="file" id="file" path="file"></form:input>
    </div>
</form:form>
