package ec.edu.ups.objetoAD;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entidadNegocio.RepresentanteEN;


@Stateless
public class RepresentanteDAO {
	
	@Inject
	private EntityManager em;
	
	public void create(RepresentanteEN r) {
		em.persist(r);

	}
	
	
	

}
