package ec.edu.ups.objetoNegocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entidadNegocio.Conductor;
import ec.edu.ups.entidadNegocio.Ruta;
import ec.edu.ups.objetoAD.ConductorDAO;
import ec.edu.ups.objetoAD.RutasDAO;


@Stateless
public class GestionRutas {
	
	@Inject
	private ConductorDAO daoConductor;
	
	@Inject
	private RutasDAO rDAO;
	
	
	
	public void guardarRutas(Ruta r) {
		rDAO.insertar(r);
		
		
	}
	
	
	public List<Ruta> getListadoRutas() {
		return rDAO.getRutas();
	}
	
	
	
	
	
public Conductor consultarConductor(int codigoConductor) throws Exception {
		
		Conductor c = daoConductor.read(codigoConductor);
		
		if (c==null) {
			throw new Exception("Conductor no Existe");
			
			
		}
		
		return c;
		
		
	}
	

}
