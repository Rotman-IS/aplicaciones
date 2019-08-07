package ec.edu.ups.objetoAD;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.entidadNegocio.Ruta;
@Stateless
public class RutasDAO {
	
	
	@Inject
	private EntityManager em;
	
	
	public void insertar(Ruta ruta) {
		em.persist(ruta);
		
	}
	
	public List<Ruta> getRutas() {
		
		String jpql= "SELECT r FROM Ruta r";
		
		Query q = em.createQuery(jpql, Ruta.class);
		
		List<Ruta> ruta = q.getResultList();
		return ruta;
		
		
		
	}
	
}
