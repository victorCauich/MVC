<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ page import="DTOs.PersonaDTO" %>
<html>
<head>
    <title>Objetos de Aprendizaje</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie-edge">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/ODA.css">

</head>
<body background="img/fondo.png">

<%

    PersonaDTO personaDTO = (PersonaDTO) request.getAttribute("personaDTO");
%>

<br><br>

<div class="container col-10 col-sm-10 col-md-11 col-lg-11 col-xl-10">
    <div class="table-responsive">
        <table class="table table-bordered table-striped table-hover table-light">
            <thead class="table-success" align="center">
            <th colspan="4">Datos de la persona ingresada</th>
            </thead>
            <tbody>
            <tr>
                <td>Primer Nombre</td>
                <td>Segundo Nombre</td>
                <td>Apellido Paterno</td>
                <td>Apellido Materno</td>
            </tr>
            <tr>
                <td>
                    <% out.println(personaDTO.getPrimerNombre());%>
                </td>
                <td>
                    <% out.println(personaDTO.getSegundoNombre());%>
                </td>
                <td>
                    <% out.println(personaDTO.getApellidoPaterno());%>
                </td>
                <td>
                    <% out.println(personaDTO.getApellidoMaterno());%>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <br><br>
    <a href="index.jsp" class="btn btn-info float-right btn-block">Salir a la pagina principal</a>
</div>

<script src="js/jquery-3.2.1.slim.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>

