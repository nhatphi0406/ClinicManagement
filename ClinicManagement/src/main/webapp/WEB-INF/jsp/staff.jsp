<%-- 
    Document   : staff
    Created on : 15 Aug 2022, 23:38:31
    Author     : nhatp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <form class="form-inline" action="<c:url value="/admin/staff" />">
            <input class="form-control mr-sm-2" name="kw" type="text" placeholder="Nhap tu khoa...">
            <button class="btn btn-success" type="submit">Tim</button>
        </form>
    </div>
</nav>
            
<h1 class="text-center text-danger">QUAN LY NHAN VIEN</h1>

<ul class="pagination">
    <c:forEach begin="1" end="${Math.ceil(userCounter/9)}" var="i">
        <c:url value="/admin/staff" var="c">
            <c:param value="${i}" name="page"  />
        </c:url>
        <li class="page-item"><a class="page-link" href="${c}">${i}</a></li>
        </c:forEach>
</ul>
<div class="row">
    <c:forEach var="s" items="${staff}">
        <div class="col-md-4 col-xs-12" style="padding: 10px">
            <div class="card">
                <a href="<c:url value="/admin/staff/staff-detail/${s.id}" />">
                    <c:choose>
                        <c:when test="${s.avata != null && s.avata.startsWith('https') == true}">
                            <img class="card-img-top img-fluid" src="${s.avata}" alt="Card image">
                        </c:when>

                        <c:when test="${s.avata == null || s.avata.startsWith('https') == false}">
                            <img class="card-img-top img-fluid" src="<c:url value="/images/null-avata.png" />" alt="Card image">
                        </c:when>
                    </c:choose>
                </a>

                <div class="card-body">
                    <h4 class="card-title">${s.firstName} ${s.lastName}</h4>
                </div>
            </div>
        </div>
    </c:forEach>
</div>