package ec.edu.ups.entidadNegocio;

import java.util.Date;

public class RegistroEN {
	
	//atributos de Registro
	private String codigo;
	private Date fecha;
	private int alumnosTotales;
	
	//Getters y Setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getAlumnosTotales() {
		return alumnosTotales;
	}
	public void setAlumnosTotales(int alumnosTotales) {
		this.alumnosTotales = alumnosTotales;
	}
	
	
	
}
