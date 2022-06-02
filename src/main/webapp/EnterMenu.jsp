<%--
  Created by IntelliJ IDEA.
  User: Vlad
  Date: 21.04.2022
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<head>
    <link rel="stylesheet" href="css/index.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <header class="header">
        <div class="header_conteiner">
            <div class="header_inener">
                <div class="header_logo">
                </div>
                <div>
                    <nav>
                        <ul class="topmenu">
                            <li><a href="Features.jsp">Stocks</a></li>
                            <li><a href="">Works</a></li>
                            <li><a href="" class="down">Menu</a>
                                <ul class="submenu">

                                    <li><a href="Gallery.jsp">Gallery</a></li>
                                    <li><a href="OurTeam.jsp">OurTeam</a></li>
                                    <li><a href="">Tags</a></li>
                                </ul>
                            </li>
                            <li><a href="" class="down">Account</a>
                                <ul class="submenu">
                                    <li><a href="regmenu.jsp">Registration</a></li>
                                    <li><a href="EnterMenu.jsp">Enter</a></li>

                                </ul>
                            </li>
                            <li><a href="">Currency</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>

    </header>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: rgb(150, 150, 150);
        }

        * {
            box-sizing: border-box;
        }

        /* Add padding to containers */
        .container {
            margin-top: 6.5%;
            padding: 16px;
            background-color: rgb(182, 182, 182);
        }

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }

        /* Overwrite default styles of hr */
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        /* Set a style for the submit button */
        .registerbtn {
            background-color: #4CAF50;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }

        /* Add a blue text color to links */
        a {
            color: dodgerblue;
        }

        /* Set a grey background color and center the text of the "sign in" section */
        .signin {
            background-color: #f1f1f1;
            text-align: center;
        }
    </style>
</head>
<body>

<form action="/action_page.php">
    <div class="container">
        <%--@declare id="psw"--%><%--@declare id="email"--%><h1>Sing in</h1>
        <p>Please fill in this form to enter dccount.</p>
        <hr>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>
        <hr>
        <p>By creating an account you agree to our <a href="index.jsp">Terms & Privacy</a>.</p>

        <button type="submit" class="registerbtn">Sing in</button>
    </div>
    <div class="container signin">
        <p>Already have't an account? <a href="regmenu.jsp">Registration</a>.</p>
    </div>
</form>

</body>
</body>
</html>
