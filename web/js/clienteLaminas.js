/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$().ready(inicio);

function inicio()
{
    //alert("ok");
    
    $("#btnActualizar").click(actualizar);
    $("#btnConsultar").click(consultar);
   // $(consultar);
}

var owner;
function actualizar()
{
     
    var url = "http://localhost:8989/Album/app/oper/actualizarLaminas";
    $.ajax( {
        url : url, 
        data: JSON.stringify({numeroLamina: $("#txtNum").val(), propietario: $("#txtPropietario").val(owner)}),
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
            console.log(owner);
        },
        error : function () {
            alert("Error al consultar");
        }
    });
    
}

