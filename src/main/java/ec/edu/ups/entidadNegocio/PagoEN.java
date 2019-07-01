package ec.edu.ups.entidadNegocio;

import java.util.Date;

public class PagoEN {
	
	//atributos de pago
	private String codigo;
	private Date fecha;

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
	
}
