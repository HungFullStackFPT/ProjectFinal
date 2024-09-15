<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header>
    <div class="container">
        <div class="d-flex justify-content-between align-items-center py-4">
            <div class="d-flex align-items-center">
                <img class="mr-4" src="./static/img/logo.png" width="100px" height="auto" style="padding: 10px;" />
                <form class="form-inline mr-3">
                    
                </form>
            </div>
            <nav class="navbar navbar-expand-lg navbar-dark">
                <div class="container">
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-center" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link" style="color: blue;" href="http://localhost:8080/ProjectFinal/home">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" style="color: blue;" href="http://localhost:8080/ProjectFinal/shop">Products</a>
                            </li>
                            
                            <c:if test="${sessionScope.account != null}">
                                <li class="nav-item">
                                <a href="http://localhost:8080/ProjectFinal/editProfile" class="nav-link" style="color: blue;" href="#products">Edit Profile</a>
                            </li>
                                <li class="nav-item">
                                    <a href="http://localhost:8080/ProjectFinal/logout" class="nav-link" style="color: blue;" href="#contact">Logout</a>
                                </li>
                            </c:if>
                                <c:if test="${sessionScope.account.role_id.role_id == 1}">
                                    <li class="nav-item">
                                <a href="http://localhost:8080/ProjectFinal/admin" class="nav-link" style="color: blue;" href="#products">Statistic</a>
                                </c:if>

                        </ul>
                    </div>
                </div>
            </nav>
            <div class="d-flex align-items-center">
                <c:if test="${sessionScope.account == null}">
                    <a href="http://localhost:8080/ProjectFinal/login" class="btn btn-outline-primary mr-3">Login</a>
                </c:if>
                <c:if test="${sessionScope.account != null}">
                    <a>${sessionScope.account.fullname}</a>
                </c:if>
                    <a href="http://localhost:8080/ProjectFinal/managerCart" class="cart-icon"><i class="fas fa-shopping-cart text-primary" ></i><span id="amountCart"></span></a>
            </div>
        </div>
    </div>
</header>