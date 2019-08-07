package ec.edu.ups.entidadNegocio;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbl_estudiante")
@AttributeOverrides(
		value = {
				@AttributeOverride(name="cedula", column = @Column(name="cedula_est")),
				@AttributeOverride(name="nombre", column = @Column(name="nombre_est")),
				@AttributeOverride(name="apellido", column = @Column(name="apellido_est")),
				@AttributeOverride(name="edad", column = @Column(name="eda_est")),
		}
		)
public class EstudianteEN extends Persona{

	@Id
	@GeneratedValue
	private int codigo;
	
	@Size(min = 4, max = 100)
	@NotNull
	private String escuela;
	
	@Size(min = 4, max = 100)
	@NotNull
	private String direcionEscuela;
	
	@OneToOne
	@JoinColumn(name="codigo_rep")
	private RepresentanteEN representrante;
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public String getDirecionEscuela() {
		return direcionEscuela;
	}
	public void setDirecionEscuela(String direcionEscuela) {
		this.direcionEscuela = direcionEscuela;
	}
	
	
	public RepresentanteEN getRepresentrante() {
		return representrante;
	}
	public void setRepresentrante(RepresentanteEN representrante) {
		this.representrante = representrante;
	}

	
	
	
	
}
