<%--
  Created by IntelliJ IDEA.
  User: Victor Manuel Chan C
  Date: 18/03/2019
  Time: 01:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title></title>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie-edge">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
  <link rel="stylesheet" type="text/css" href="/css/design.css"/>
</head>
<body background="img/fondo.png">
<br>
<div class="container">
  <div class="row form-inline justify-content-center">
    <div>
      <form action="AltaPersona" method="post">
        Primer Nombre:<br>
        <input type="text" class="form-control form-control-lg" name="primerNombre" value="" placeholder="Ingrese su primer nombre" size="25"><br>
        Segundo Nombre:<br>
        <input type="text" class="form-control form-control-lg" name="segundoNombre" value="" placeholder="Ingrese su segundo nombre" size="25"><br>
        Apellido Paterno:<br>
        <input type="text" class="form-control form-control-lg" name="apellidoPaterno" value="" placeholder="Ingrese su apellido paterno" size="25"><br>
        Apellido Materno:<br>
        <input type="text" class="form-control form-control-lg" name="apellidoMaterno" value="" placeholder="Ingrese su apellido materno" size="25"><br>
        <br>
        <button type="submit" name="button" class="btn btn-lg btn-success">Registrar Persona</button>
      </form>
    </div>
  </div>
</div>
<script src="js/jquery-3.2.1.slim.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>

