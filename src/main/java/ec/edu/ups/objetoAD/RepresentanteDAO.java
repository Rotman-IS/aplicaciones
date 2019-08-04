package ec.edu.ups.objetoAD;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.entidadNegocio.RepresentanteEN;


@Stateless
public class RepresentanteDAO {
	
	@Inject
	private EntityManager em;
	
	public void create(RepresentanteEN r) {
		em.persist(r);

	}
	
	public RepresentanteEN validarLogin(String usuario, String password) {
		String jpql = "SELECT rep FROM RepresentanteEN rep WHERE rep.usuario = :user AND rep.contrasenia = :pass";
		Query q = em.createQuery(jpql, RepresentanteEN.class );
		q.setParameter("user", usuario);
		q.setParameter("pass", password);
		 
		
		return (RepresentanteEN) q.getSingleResult();
	}
	
	
	

}
