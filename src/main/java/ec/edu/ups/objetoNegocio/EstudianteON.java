package ec.edu.ups.objetoNegocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.EstudianteEN;
import ec.edu.ups.objetoAD.EstudianteDAO;

@Stateless
public class EstudianteON {
	
	@Inject
	private EstudianteDAO estudianteDAO;
	
	public void guardar(EstudianteEN estudiante) {
		estudianteDAO.create(estudiante);
	}

}
