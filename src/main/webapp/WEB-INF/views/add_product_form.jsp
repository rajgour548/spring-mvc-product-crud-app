<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-5">
    <div class="card shadow-sm">
        <div class="card-header bg-primary text-white">
            <h4 class="mb-0">Add Product</h4>
        </div>
        <div class="card-body">
            <form action="handle-product" method="post">
                
                <!-- Product Name -->
                <div class="form-group">
                    <label for="productName">Product Name</label>
                    <input type="text" id="productName" name="name" class="form-control" placeholder="Enter product name" required>
                </div>

                <!-- Product Description -->
                <div class="form-group">
                    <label for="productDescription">Product Description</label>
                    <textarea id="productDescription" name="description" class="form-control" rows="3" placeholder="Enter product description" required></textarea>
                </div>

                <!-- Product Price -->
                <div class="form-group">
                    <label for="productPrice">Product Price</label>
                    <input type="number" id="productPrice" name="price" class="form-control" placeholder="Enter price" step="0.01" min="0" required>
                </div>

                <!-- Buttons -->
                <div class="d-flex justify-content-between">
                    <a href="${pageContext.request.contextPath }" class="btn btn-danger">Back</a>
                    <button type="submit" class="btn btn-success">Add</button>
                </div>

            </form>
        </div>
    </div>
</div>
</body>
</html>