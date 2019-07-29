package ec.ups.edu.vista;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.Conductor;
import ec.edu.ups.entidadNegocio.Ruta;
import ec.edu.ups.objetoNegocio.GestionRutas;


@ManagedBean//(name = "rutasControl")
@ViewScoped
public class RutasControl {

	private Ruta ruta;

	@Inject
	private FacesContext fc;

	@Inject
	private GestionRutas rutON;

	@PostConstruct
	private void init() {
		ruta = new Ruta();

	}

	public Ruta getRuta() {
		return ruta;
	}

	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}
	
	public String guardarDatos() {
		
		rutON.guardarRutas(ruta);
		
		return null;
		
	}
	
public void consultarConductor() {
		
		Conductor c;
		try {
			c = rutON.consultarConductor(ruta.getIdCondcutorTem());
			ruta.setConductor(c);
			
		}catch (Exception e) {
			
			ruta.setConductor(null);
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),"error");
			fc.addMessage("txtConductor", msg);
			e.printStackTrace();
			}
			
		}

	

}
