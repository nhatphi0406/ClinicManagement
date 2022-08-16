<%-- 
    Document   : product-detail
    Created on : 14 Aug 2022, 22:27:25
    Author     : nhatp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1 class="text-center text-danger">CHI TIET SAN PHAM</h1>
<div class="row">
    <div class="col-md-6">
        <c:choose>
            <c:when test="${product.image != null && product.image.startsWith('https') == true}">
                <img class="card-img-top img-fluid" src="${product.image}" alt="Card image">
            </c:when>

            <c:when test="${product.image == null || product.image.startsWith('https') == false}">
                <img class="card-img-top img-fluid" src="<c:url value="/images/null-product.png" />" alt="Card image">
            </c:when>
        </c:choose>
    </div>
    <div class="col-md-6">
        <h1>${product.name}</h1>
        <h3 class="text-danger">${product.price} VND</h3>
        <p>${product.description}</p>
    </div>
</div>
