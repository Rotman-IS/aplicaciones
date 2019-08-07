package ec.edu.ups.servicios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import ec.edu.ups.entidadNegocio.RepresentanteEN;
import ec.edu.ups.entidadNegocio.Ruta;
import ec.edu.ups.objetoNegocio.GestionRutas;
import ec.edu.ups.objetoNegocio.RepresentanteON;

@Path("/operaciones")
public class ServiciosOperacion {
	
	@Inject
	private RepresentanteON rON;
	
	@Inject
	private GestionRutas rutasON;
	
	//http://localhost:8080/JSF-RutasTE/ws/operaciones/listar
	
	@POST
	@Path("/login/{usuario}/{contrasenia}")
	@Consumes("application/json")
	@Produces("application/json")
	public RepresentanteEN login(@PathParam("usuario") String usuario, @PathParam("contrasenia") String contrasenia ) {
		System.out.println("llega al servicio: "+ usuario+" pass: "+contrasenia);
		return rON.login(usuario, contrasenia);
	}
	
	@POST
	@Path("/insertar")
	@Consumes("application/json")
	@Produces("application/json")
	public Response insertar(RepresentanteEN representante) {
		
		Response.ResponseBuilder builder = null;
		Map<String, String> data = new HashMap<>();
		try {

			rON.guardar(representante);
			data.put("code", "1");
			data.put("message", "OK");
			builder = Response.status(Response.Status.OK).entity(data);
			System.out.println("insertar datos conductor CS");
			
			
		}catch (Exception e) {
			e.printStackTrace();
			data.put("code", "99");
			data.put("message", e.getMessage());
			builder = Response.status(Response.Status.BAD_REQUEST).entity(data);
		}
		return builder.build();
	}
	
	
	
	@POST
	@Path("/insertarRutas")
	@Consumes("application/json")
	@Produces("application/json")
	
	public Response insertar(Ruta ruta) {
		Response.ResponseBuilder builder = null;
		Map<String, String> data = new HashMap<>();
		
		try {
			rutasON.guardarRutas(ruta);
			data.put("code", "1");
			data.put("message", "OK");
			builder = Response.status(Response.Status.OK).entity(data);
			System.out.println("insertar datos conductor CS");

		} catch (Exception e) {
			e.printStackTrace();
			data.put("code", "99");
			data.put("message", e.getMessage());
			builder = Response.status(Response.Status.BAD_REQUEST).entity(data);
		}
		
		return builder.build();
	}
	
	@GET
	@Path("listadoRutas")
	@Produces("application/json")
	public List<Ruta> getRutas(){
		
		List<Ruta> listado = rutasON.getListadoRutas();
		return listado;
	}
	
	
	
	

}
