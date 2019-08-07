package ec.edu.ups.objetoAD;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.entidadNegocio.EstudianteEN;

@Stateless
public class EstudianteDAO {
	
	@Inject
	private EntityManager em;
	
	public void create(EstudianteEN estudiante) {
		em.persist(estudiante);

	}
}
