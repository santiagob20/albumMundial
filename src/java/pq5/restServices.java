package pq5;

import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pq2.Lamina;
import pq2.Respuesta;
import pq2.User;
import pq4.operLamina;
import pq4.operUser;

/**
 *
 * @author sb
 */
@Path("oper")
public class restServices
{
   private static Logger log = LogManager.getLogger(operLamina.class);
    @POST
    @Path("insertarUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)    
    public Respuesta insertUser(User u)
    {
        Respuesta rta = new Respuesta();
        operUser op = new operUser();
        operLamina opl = new operLamina();
        
        if (op.insertar(u) && opl.insertar(u))
        {
            rta.setCodigo(1);
            rta.setDescripcion("insertado usuario  y tabla OK");
        }
        else
        {
            rta.setCodigo(0);
            rta.setDescripcion("Error al insertar usuario!");
        }
        return rta;        
    }
    
    
    @Path("consultarLogin") 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)    
    public Respuesta consultar(User us)
    {
        
        Respuesta rta = new Respuesta();
        operUser op = new operUser();
        boolean ans= op.Consultar(us);
        if(ans==true)
        {
            log.info("consultado get correcto");
            //codigo 1 = consultado correctamente
            rta.setCodigo(1);
            rta.setDescripcion("Usuario valido para ingresar");
            rta.setNombreUser(us.getUsuario());
        }else
        {
            //codigo 0 = error
            rta.setCodigo(0);
            rta.setDescripcion("error al encontrar usuario en la bd");
        }
        return rta;
    }
    
    @Path("consultarLaminas") 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)    
    public Respuesta consultarLaminas(User us)
    {
        ArrayList<Lamina> lista = new ArrayList<Lamina>();
        Respuesta rta = new Respuesta();
        operLamina op = new operLamina();
        lista = op.Consultar(us);
        System.out.println("lista:"+lista.size());
        if(lista!=null)
        {
            log.info("laminas consultadas "+lista.size());
            //codigo 1 = consultado correctamente
            rta.setCodigo(1);
            rta.setDescripcion(lista.size()+" Laminas por encontrar");
            rta.setLista(lista);
        }else
        {
            //codigo 0 = error
            rta.setCodigo(0);
            rta.setDescripcion("error al buscar sus laminas faltantes");
        }
        return rta;
    }
    
    
    @POST
    @Path("actualizarLaminas") 
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)    
    public Respuesta actualizarLaminas(Lamina l)
    {
        Respuesta rta = new Respuesta();
        operLamina op = new operLamina();
        
        if(op.editar(l))
        {
            log.info("lamina actualizada: "+l.getNumeroLamina());
            //codigo 1 = consultado correctamente
            rta.setCodigo(1);
            rta.setDescripcion("lamina actualizada correctamente");
        }else
        {
            //codigo 0 = error
            rta.setCodigo(0);
            rta.setDescripcion("error al actualizar estado de la lamina");
        }
        return rta;
    }
}
