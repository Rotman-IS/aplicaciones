package ec.edu.ups.servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import ec.edu.ups.entidadNegocio.RepresentanteEN;
import ec.edu.ups.objetoNegocio.RepresentanteON;

@Path("/operaciones")
public class ServiciosOperacion {
	
	@Inject
	private RepresentanteON rON;
	
	//http://localhost:8080/JSF-RutasTE/ws/operaciones/listar
	
	
	
	@POST
	@Path("/insertar")
	@Consumes("application/json")
	@Produces("application/json")
	public RepresentanteEN insertar(RepresentanteEN representante) {
		try {
			System.out.println(representante.toString());
			rON.guardar(representante);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return representante;
	}
}
