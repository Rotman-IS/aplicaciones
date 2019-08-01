package ec.edu.ups.objetoNegocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.RepresentanteEN;
import ec.edu.ups.objetoAD.RepresentanteDAO;

@Stateless
public class RepresentanteON {

	@Inject
	private RepresentanteDAO rDAO;
	
	
	public void guardar(RepresentanteEN r) {
		rDAO.create(r);
		
	}
	
	
}
