package ec.edu.ups.objetoNegocio;

import java.util.List;

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
	
	
	public List<RepresentanteEN> getListadoRepresentante(){
		
		return rDAO.getRepresentantes();	
		}
		
		
		public void buscarcedula(RepresentanteEN r) {
			r.getCedula();
			
			if(r.getCedula() != null)
			//rDAO.listarxCedula(r.getCedula());
				rDAO.listarxCedula(r.getCedula());
			else {
				
				System.out.println("error");
			}
		
			
		}
	
	
	public RepresentanteEN login(String user, String pass) {
		return rDAO.validarLogin(user, pass);
	}
	
}
