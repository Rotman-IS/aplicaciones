package ec.edu.ups.objetoNegocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.Conductor;
import ec.edu.ups.objetoAD.ConductorDAO;




@Stateless
public class ConductorON {


	@Inject
	private ConductorDAO dao;

	public void guardar(Conductor c) throws Exception {
		System.out.println(c.getNombre());
		if (c.getNombre().length() < 5)
			
			throw new Exception("Dimension Corta");
		dao.save(c);
		c.getCodigo();
		System.out.println("asdfghj          " + c.getCodigo());

	}

	public List<Conductor> getListadoConductores() {
		return dao.getConductor();

	}

	public void borrar(int codigo) throws Exception {

		try {
			dao.delete(codigo);
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("error al borrar" + e.getMessage());
		}

	}

	public Conductor getConductor(int codigo) {
		//paso 9 cabiar el read por read dos para lazy
		//Conductor aux = dao.read(codigo);
		//paso 11 cambiar por el mas eficiente read 3
		Conductor aux = dao.read2(codigo);
		//Conductor aux = dao.read3(codigo);

		return aux;
	}

}
