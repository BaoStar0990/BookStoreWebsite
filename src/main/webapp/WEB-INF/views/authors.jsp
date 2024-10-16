<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container mt-5 author-section pt-4">
    <h2 class="text-center mb-4 font-bold">Các tác giả</h2>

    <div class="row justify-content-center">

<%--        attribute : authors List<Author>--%>

        <c:forEach var="author" items="${authors}">

            <div class="col-3 col-sm-2 my-2 text-center">
                <div class="author-card">
                    <img src="${pageContext.request.contextPath}${author.imageURL}" alt="${author.name}" class="author-image">
                    <p class="font-semibold mt-1">${author.name}</p>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
