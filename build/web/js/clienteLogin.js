$().ready(inicio);

function inicio()
{
    $("#btnLogin").click(ingresar);
    $("#btnCrear").click(registrar);
    $("#btnLamina").click(actualizar);
    $("#btnConsultar").click(consultar);
}


var owner;
function ingresar()
{
     
    var url = "http://localhost:8989/Album/app/oper/consultarLogin";
    $.ajax( {
        url : url, 
        data: JSON.stringify({usuario: $("#txtUser").val(), password: $("#txtPassword").val()}),
        type : "POST", 
        async : true,  
        contentType : "application/json",
        
        success : function (rta)
        {
            var codigo = rta.codigo;
            if(codigo === 1)
            {
            //alert("entró");
            owner = $("#txtUser").val();
            
            window.location="http://localhost:8989/Album/principal.html";
            document.getElementById('nombreUser').innerHTML = rta.nombreUser;
            $('#nombreUser').val(rta.nombreUser);

            }
            else
            {
                alert("Usuario o contraseña invalidos");
                window.location="http://localhost:8989/Album/index.html";
                $("#txtUser").val("");
            }
        },
        error : function () {
            alert("error en el sistema, consulte al administrador");
            window.location="http://localhost:8989/Album/index.html";
            $("#txtUser").val("");
        }
    });
}

function registrar()
{
    var url = "http://localhost:8989/Album/app/oper/insertarUser";
    $.ajax( {
        url : url,
        data: JSON.stringify({nombre: $("#txtNombre").val(),apellido: $("#txtApellido").val(),usuario: $("#txtUser").val(), password: $("#txtPassword").val(),pais: $("#txtPais").val(),}),
        type : "POST", 
        async : true,  
        contentType : "application/json",
        success : function (data) 
        {
            alert("Usuario creado exitosamente");
            window.location="http://localhost:8989/Album/index.html";
            
        },
        error : function () {
            alert("Error al crear usuario, consulte al administrador");
        }
    });
}
function actualizar()
{
     
    var url = "http://localhost:8989/Album/app/oper/actualizarLaminas";
    $.ajax( {
        url : url, 
        data: JSON.stringify({numeroLamina: $("#txtNum").val(), propietario: $("#txtPropietario").val()}),
        type : "POST", 
        async : true,  
        contentType : "application/json",
        
        success : function (respuesta) 
        {
            
            var codigo = respuesta.codigo;
            if (codigo === 1)
            {
                alert("Actualizada correctamente");
                window.location=("http://localhost:8989/Album/album.html");
            }
            else
            {
                alert("Error al actualizar");
            }            
        },
        error : function () {
            alert("Error al comunicarse con la base, consulte al administrador");
        }
    });
    
}

function consultar()
{
    var url = "http://localhost:8989/Album/app/oper/consultarLaminas";
    $.ajax( {
        url : url, 
        data: JSON.stringify({usuario: $("#txtPropietario").val()}),
        type : "POST", 
        async : true,  
        contentType : "application/json",
        success : function (respuesta)
        {
            var data = respuesta.lista;
            var i;
            var t = $('#tabla').DataTable();
            t.clear();
            owner=data.propietario;
            for(i=0; i<data.length; i++)
            {
                t.row.add([
                    data[i].numeroLamina,
                    //$('#dfff').append("<input >")
                    //data[i].encontrada
                    data[i].propietario
                ]).draw(true);
            }
            $('txtPropietario').val(data.propietario);
            owner = data.propietario;
        },
        error : function () {
            alert("Error al consultar");
        }
    });
    
}

