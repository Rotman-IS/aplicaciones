package ec.ups.edu.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.entidadNegocio.Conductor;
import ec.edu.ups.entidadNegocio.Ruta;
import ec.edu.ups.objetoNegocio.ConductorON;




@ManagedBean//(name = "conductorControl")
@ViewScoped
public class ConductorControl {
	

	@Inject
	private ConductorON cON;
	
	
	
	private Conductor conductor  = new Conductor();
	private List<Conductor> listadoConductores;
	
	//PASO 12 Para pasar id de xhtml	
	private int id;
	
	
	@PostConstruct
	public void init() {
		 //paso3 
		conductor = new Conductor();
		conductor.addRutas(new Ruta()); //3
		listadoConductores = cON.getListadoConductores();

	}
		

public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}


	public List<Conductor> getListadoConductores() {
		return listadoConductores;
	}


	public void setListadoConductores(List<Conductor> listadoConductores) {
		this.listadoConductores = listadoConductores;
	}


public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



public String cargarDatos() {
		
		try {
			cON.guardar(conductor);
			conductor = new Conductor();
			return "create-conductor";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return null;
	}


public String editar(int codigo) {
	
	System.out.println(codigo+"ed");
	System.out.println("create-conductor?faces-redirect=true&id="+codigo);
	conductor=cON.getConductor(codigo);
	
	//paso 5 solo syso
	System.out.println(conductor.getCodigo() + "   "+ conductor.getNombre() );
	System.out.println("# rutas"+ "  "+conductor.getRutas().size());
	//eturn "create-conductor";
	
	return "create-conductor?faces-redirect=true&id="+codigo;	
}


public String borrar(int codigo) {
	
	System.out.println("codigo borrar"+codigo);
	init();
	try {
		cON.borrar(codigo);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("error"+e.getMessage());
		e.printStackTrace();
	}

		
		return "list-Conductor";
	
}


//// usar para el menu

public String nuevo(){
	System.out.println("llega a nuevo");
	conductor = new Conductor();
	return "create-conductor";
	
	
}

public String ListarConduc() {
	System.out.println("llega a listar");
	return "list-Conductor";
	
}

//paso 4 para se baya sumando  
public void addRutas() {
	conductor.addRutas(new Ruta());
	System.out.println("rutas"+conductor.getRutas().size());
	
}



//paso 13 con id 
public void loadData() {
	System.out.println("codigo editar"+  id);
	if(id ==0 )
		return;
	System.out.println("create-conductor?faces-redirect=true&id="+id);
	conductor=cON.getConductor(id);
	System.out.println(conductor.getCodigo() + "   "+ conductor.getNombre() );
	System.out.println("# rutas"+ "  "+conductor.getRutas().size());
	
}


}
