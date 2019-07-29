package ec.edu.ups.objetoAD;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.entidadNegocio.Conductor;



@Stateless
public class ConductorDAO {

	@Inject
	private EntityManager em;

	
	
	
	public void create(Conductor c) {
		em.persist(c);

	}

	public void update(Conductor c) {

		em.merge(c);

	}

	public void delete(int id) {
		Conductor c = read(id);
		em.remove(c);

	}

	public void save(Conductor c) {

		if (this.read(c.getCodigo()) != null) {
			this.update(c);
		System.out.println("se Actualizo correctamente");
		
		}else {
			this.create(c);
		System.out.println("se guardo correctamente");
		}

	}
	
	public Conductor read(int id) {

		return em.find(Conductor.class, id);
	}
	
	
	public List<Conductor> getConductor() {

		String jpql = "SELECT c FROM Conductor c ";

		Query q = em.createQuery(jpql, Conductor.class);

		List<Conductor> conductor = q.getResultList();

		return conductor;

	}

	
	/** paso 7   consultar bajo demanda para el lazy * */
	
	public Conductor read2(int id) {

		Conductor c= em.find(Conductor.class, id);
		c.getRutas().size(); //agragar forzar el selec
		return c;
	}
	
	//paso 10 solo saca la persona y telefono = eficiente que el size
	public Conductor read3(int id) {
		/** String jpql = "SELECT c FROM Conductor c"
				+ "				JOIN FETCH c.rutas r "
				+ "				JOIN FETCH c.direccions d "
				+ "WHERE c.codigo = ? ";*/
		
		
		String jpql = "SELECT c FROM Conductor c"
				+ "				JOIN FETCH c.rutas r "
				+ "WHERE c.codigo = :codigoaux ";

		Query q = em.createQuery(jpql, Conductor.class);
		q.setParameter("codigoaux", id);
		Conductor c = (Conductor) q.getSingleResult();
		

		return c;

	}
	
	
	
	

}
