package ec.edu.ups.objetoNegocio;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entidadNegocio.Conductor;
import ec.edu.ups.entidadNegocio.Ruta;
import ec.edu.ups.objetoAD.ConductorDAO;


@Stateless
public class GestionRutas {
	
	@Inject
	private ConductorDAO daoConductor;
	
	@Inject
	private EntityManager em;
	
	
	public void guardarRutas(Ruta ruta) {
		em.persist(ruta);
		
	}
	
public Conductor consultarConductor(int codigoConductor) throws Exception {
		
		Conductor c = daoConductor.read(codigoConductor);
		
		if (c==null) {
			throw new Exception("Conductor no Existe");
			
			
		}
		
		return c;
		
		
	}
	

}
