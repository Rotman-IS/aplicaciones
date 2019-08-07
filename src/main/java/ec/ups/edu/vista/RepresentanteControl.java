package ec.ups.edu.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.RepresentanteEN;
import ec.edu.ups.objetoNegocio.RepresentanteON;

@ManagedBean
@ViewScoped
public class RepresentanteControl {
	
	@Inject
	private RepresentanteON rON;
	
	
	private RepresentanteEN representante = new RepresentanteEN();
	private List<RepresentanteEN> listadoRepresentante;
	
	
	@PostConstruct
	public void init() {
		representante = new RepresentanteEN();
		listadoRepresentante = rON.getListadoRepresentante();
		
	}





	public RepresentanteEN getRepresentante() {
		return representante;
	}


	public void setRepresentante(RepresentanteEN representante) {
		this.representante = representante;
	}


	public List<RepresentanteEN> getListadoRepresentante() {
		return listadoRepresentante;
	}


	public void setListadoRepresentante(List<RepresentanteEN> listadoRepresentante) {
		this.listadoRepresentante = listadoRepresentante;
	}
	
	
	
	public String cedula() {
		rON.buscarcedula(representante);
		
		return "list-usuario";
	}
	
	
	
	

}
