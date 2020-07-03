<%--
  Created by IntelliJ IDEA.
  User: wp-sutra-lp-12
  Date: 6/12/2020
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Bootstrap CRUD Data Table for Database with Modal Form</title>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <script src="../../../resources/static/js/action.js"></script>

<body>
<div class="alert alert-success" role="alert">
  <h4 class="alert-heading">Sandesh Lamsal !</h4>
  <p>J2EE Spring Boot, MVC, JSP , MYSQL CRUD APP </p>
  <hr>
  <p class="mb-0">Enjoy to Demo !</p>
</div>
<br><br>

<form method="post" action="/add" >
  <table width="700">
  <div class="form-group">
    <label for="address">Name</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
   </div>

    <div class="form-group">
      <label for="address">Address</label>
      <input type="text" class="form-control" id="address" name="address" placeholder="Enter Address">
    </div>

    <button type="submit" class="btn btn-primary">ADD</button>
  </table>
</form>
</body>
</html>