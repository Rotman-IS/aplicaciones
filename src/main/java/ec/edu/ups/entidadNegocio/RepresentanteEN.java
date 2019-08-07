package ec.edu.ups.entidadNegocio;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbl_representate")
@AttributeOverrides(
		value = {
				@AttributeOverride(name="cedula", column = @Column(name="cedula_rep")),
				@AttributeOverride(name="nombre", column = @Column(name="nombre_rep")),
				@AttributeOverride(name="apellido", column = @Column(name="apellido_rep")),
				@AttributeOverride(name="edad", column = @Column(name="eda_rep")),
		}
		)
public class RepresentanteEN  extends Persona{
	
	@Id
	@GeneratedValue
	@Column(name="codigo_rep")
	private int codigo;
	
	@Size(min = 4, max = 20)
	@NotNull
	private String usuario;
	
	@Size(min = 4, max = 20)
	private String contrasenia;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "codigo_rep")
	private List<EstudianteEN> estudiante;
	
	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public List<EstudianteEN> getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(List<EstudianteEN> estudiante) {
		this.estudiante = estudiante;
	}
	
//	@Override
//	public String toString() {
//		return "RepresentanteEN [codigo=" + codigo + ", usuario=" + usuario + ", contrasenia=" + contrasenia
//				+ ", estudiante=" + estudiante + "]";
//	}
	
	

	
	

}
