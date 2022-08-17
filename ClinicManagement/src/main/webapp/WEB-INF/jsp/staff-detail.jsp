<%-- 
    Document   : staff-detail
    Created on : 17 Aug 2022, 14:47:36
    Author     : nhatp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1 class="text-center text-danger">CHI TIET NHAN VIEN</h1>
<div class="row">
    <div class="col-md-6">
        <c:choose>
            <c:when test="${staff.avata != null && staff.avata.startsWith('https') == true}">
                <img class="card-img-top img-fluid" src="${staff.avata}" alt="Card image">
            </c:when>

            <c:when test="${staff.avata == null || staff.avata.startsWith('https') == false}">
                <img class="card-img-top img-fluid" src="<c:url value="/images/null-avata.png" />" alt="Card image">
            </c:when>
        </c:choose>
    </div>
    <div class="col-md-6">
        <h1>${staff.firstName} ${staff.lastName}</h1>
        <h3 class="text-danger">${staff.email}</h3>
        <p>${staff.phone}</p>
        <p>Chuc vu: ${staff.userRole}</p>
    </div>
</div>
