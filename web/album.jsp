<%-- 
    Document   : album
    Created on : Apr 5, 2018, 7:08:23 PM
    Author     : santiagob20
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <style>
            .checkbox{
                
            }
        </style>
        <title>Album del mundial</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="css/album.css" rel="stylesheet">
    </head>

    <body>

        <header>
            <div class="collapse bg-dark" id="navbarHeader">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-md-7 py-4">
                            <h4 class="text-white">&copy;2018</h4>
                            <img src="img/logo.png">
                        </div>
                        <div class="col-sm-4 offset-md-1 py-4">
                            <h4 class="text-white">Menu</h4>
                            <ul class="list-unstyled">
                                <li><a href="principal.html" class="text-white">Menu Principal</a></li>  
                                <li><a href="crearUser.html" class="text-white">Crear usuario</a></li>
                                <li><a href="tablaFichas.html" class="text-white">Ingresar Fichas encontradas</a></li>
                                <li><a href="album.jsp" class="text-white">Ver Fichas</a></li>
                                <li><a href="index.html" class="text-white">Cerrar Sesión</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="navbar navbar-dark bg-dark box-shadow">
                <div class="container d-flex justify-content-between">
                    <a href="#" class="navbar-brand d-flex align-items-center">
                        <img src="img/logo.png" width="20" height="20">

                        <strong>Ver todas las fichas del album</strong>
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarHeader" aria-controls="navbarHeader" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                </div>
            </div>
        </header>

        <main role="main">

            <section class="jumbotron text-center">
                <div class="container">
                    <table class="table-dark">
                        <% 
                            int index=0;
                            for (int i = 1; i <= 67; i++) {
                        %>
                        <tr>
                            <% for (int j = 1; j <= 10; j++) {
                              index=index+1;  
                            %>
                            <td><input type="checkbox" class="checkbox" id="check" onclick="return validarC('check')">Ficha<%out.print(index);%></td>

                            <% } %>
                        </tr>
                        <% }%>

                    </table>

                </div>
            </section>

        </main>

        <footer class="text-muted">
            <div class="container">
                <p class="float-right">
                    <a href="#">Volver al inicio</a>
                </p>
                <p>Todos los derechos reservados &copy; Panini 2018.</p>
            </div>
        </footer>

        <!-- Nucleo Bootstrap en JavaScript
        ================================================== -->
        <!-- Se pone al final del documento para que la pagina cargue más rápido -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="js/jquery-slim.min.js"><\/script>')</script>
        <script src="js/vendor/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/vendor/holder.min.js"></script>
        <script>
            function validarC(id){
            if(document.getElementById(id).checked){
                document.getElementById(id).style.backgroundColor = 'red';
            }
             
            }
        </script>
    </body>
</html>

