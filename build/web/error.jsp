<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        <!-- Bootstrap CSS -->
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet">
        <style>
            .error-container {
                margin-top: 50px;
            }
            .error-message {
                color: #d9534f;
            }
            .back-home {
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <div class="container error-container text-center">
            <h2 class="display-4">Error</h2>
            <p class="error-message lead">${errorMessage}</p>
            <a href="/ProjectFinal/home" class="btn btn-primary back-home">Back to Home</a>
        </div>

        <!-- Bootstrap JS and dependencies -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    </body>
</html>