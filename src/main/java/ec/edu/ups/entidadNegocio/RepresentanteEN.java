package ec.edu.ups.entidadNegocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class RepresentanteEN {
	
	@Id
	@GeneratedValue
	private int codigo;
	
	@Size(min = 10, max = 10)
	@NotNull
	private String cedula;
	
	@Size(min = 4, max = 20)
	@NotNull
	private String nombre;
	
	@Size(min = 4, max = 20)
	@NotNull
	private String apellido;
	
	@NotNull
	private int edad;
	
	@Size(min = 4, max = 20)
	@NotNull
	private String usuario;
	
	@Size(min = 4, max = 20)
	private String contrasenia;
	
	//Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
	@Override
	public String toString() {
		return "RepresentanteEN [codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", usuario=" + usuario + ", contrasenia=" + contrasenia + "]";
	}
	
	

}
