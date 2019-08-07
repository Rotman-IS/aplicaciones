package ec.edu.ups.objetoAD;

import java.util.List;

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
	
	
	public List<RepresentanteEN> getRepresentantes(){
		
		String jpql = "SELECT c FROM RepresentanteEN c";
		Query q = em.createQuery(jpql, RepresentanteEN.class);
		List<RepresentanteEN> representante = q.getResultList();
		return representante;
		
	}
	
	
	//public List<RepresentanteEN> listarxCedula(String cedula) {
	public RepresentanteEN listarxCedula(String cedula) {		
		
		RepresentanteEN representante;
		//String jpql = "SELECT r.codigo, r.nombre, r.apellido, r.edad, r.usuario, r.contrasenia"
		String jpql = "SELECT r "
						+ "FROM RepresentanteEN r " 
						+ "WHERE r.cedula LIKE :filtro";
				
		Query q = em.createQuery(jpql, RepresentanteEN.class);
		q.setParameter("filtro", "%"+cedula+"%");
		System.out.println(q.setParameter("filtro", "%"+cedula+"%"));
		
		 
		
		System.out.println(";lll"+ q.getResultList());
		return (RepresentanteEN) q.getSingleResult();
		
		
	}
	
	public RepresentanteEN validarLogin(String usuario, String password) {
		String jpql = "SELECT rep FROM RepresentanteEN rep WHERE rep.usuario = :user AND rep.contrasenia = :pass";
		Query q = em.createQuery(jpql, RepresentanteEN.class );
		q.setParameter("user", usuario);
		q.setParameter("pass", password);
		 
		
		return (RepresentanteEN) q.getSingleResult();
	}
	
	public RepresentanteEN recuperar(int codigo) {
		String jpql = "SELECT rep FROM RepresentanteEN rep WHERE rep.codigo = :id";
		Query q = em.createQuery(jpql, RepresentanteEN.class );
		q.setParameter("id", codigo);
		return (RepresentanteEN) q.getSingleResult();
	}
	
	
	
	

}
