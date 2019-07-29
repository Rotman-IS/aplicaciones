package ec.edu.ups.utils;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class Resources {
	
	@Produces
	@PersistenceContext
	private EntityManager em;
	
	
	
	/*  es para instanciar i mandar a mostrar los mensajes 
	 * -\de error en la interface*/
	@Produces
	@RequestScoped
	public FacesContext prodiceFC() {
		return FacesContext.getCurrentInstance();
		
		
	}
	
	  

}
