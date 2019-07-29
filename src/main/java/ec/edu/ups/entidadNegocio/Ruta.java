package ec.edu.ups.entidadNegocio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TBL_RUTAS")
public class Ruta {
	
	//borrar
	
	 // es para crear telefono com conductor en la base
	@OneToOne
	@JoinColumn(name= "con_codigo") //conductor fk
	private Conductor conductor;
	
	
//ruta de asistencia
	
	@Id
	@Column(name="rut_codigo")
	private int codigo;
	
	@NotNull
	@Column(name="rut_horaSalidaAS")
	private String horaSalidaAS;
	
	@NotNull
	@Column(name="rut_horaLlegadaAS")
	private String horaLlegadaAS;

	@NotNull
	@Column(name="rut_desdeAS") 
	private String desdeAS;
	
	@NotNull
	@Column(name="rut_haciaAS")
	private String haciaAS;
	
	@NotNull
	@Column(name="rut_codigoRuta")
	private String codigoRuta;

// ruta de Retorno
	
	@NotNull
	@Column(name="rut_horaSalidaRT")
	private String horaSalidarRT;
	
	@NotNull
	@Column(name="rut_horaLlegadaRT")
	private String horaLlegadaRT;
	
	@NotNull
	@Column(name="rut_desdeRT")
	private String desdeRT;
	
	@NotNull
	@Column(name="rut_haciaRT")
	private String haciaRT;
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getHoraSalidaAS() {
		return horaSalidaAS;
	}

	public void setHoraSalidaAS(String horaSalidaAS) {
		this.horaSalidaAS = horaSalidaAS;
	}

	public String getHoraLlegadaAS() {
		return horaLlegadaAS;
	}

	public void setHoraLlegadaAS(String horaLlegadaAS) {
		this.horaLlegadaAS = horaLlegadaAS;
	}

	public String getDesdeAS() {
		return desdeAS;
	}

	public void setDesdeAS(String desdeAS) {
		this.desdeAS = desdeAS;
	}

	

	public String getHaciaAS() {
		return haciaAS;
	}

	public void setHaciaAS(String haciaAS) {
		this.haciaAS = haciaAS;
	}

	public String getHoraSalidarRT() {
		return horaSalidarRT;
	}

	public void setHoraSalidarRT(String horaSalidarRT) {
		this.horaSalidarRT = horaSalidarRT;
	}

	public String getHoraLlegadaRT() {
		return horaLlegadaRT;
	}

	public void setHoraLlegadaRT(String horaLlegadaRT) {
		this.horaLlegadaRT = horaLlegadaRT;
	}

	public String getDesdeRT() {
		return desdeRT;
	}

	public void setDesdeRT(String desdeRT) {
		this.desdeRT = desdeRT;
	}

	public String getHaciaRT() {
		return haciaRT;
	}

	public void setHaciaRT(String haciaRT) {
		this.haciaRT = haciaRT;
	}

	public String getCodigoRuta() {
		return codigoRuta;
	}

	public void setCodigoRuta(String codigoRuta) {
		this.codigoRuta = codigoRuta;
	}
	
	
	
	//borrar
	@Transient // para un valor temporal y no se va reflejar en la base solo va comparar los datos existentes en la base de datos de Conductpr
	private int idCondcutorTem;
	
	public int getIdCondcutorTem() {
		return idCondcutorTem;
	}
	public void setIdCondcutorTem(int idCondcutorTem) {
		this.idCondcutorTem = idCondcutorTem;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	
	
	

	//{"codigo":1,"horaSalidaAS":"7:00 am","horaLlegadaAS":"8:00 am","desdeAS":"San Sebastian","haciaAS":"UPS","horaSalidarRT":"13:00 pm","horaLlegadaRT":"14:00 pm","desdeRT":"UPS","haciaRT":"San Sebastian","codigoRuta":"1234asdff"}
	
	
}
