package ec.edu.ups.entidadNegocio;

public class BusEN {

	//atributos de Bus
	private String codigo;
	private String color;
	private String placa;
	private String capacidad;
	private boolean dispoibilidad;
	
	
	//Getters y Setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public boolean isDispoibilidad() {
		return dispoibilidad;
	}
	public void setDispoibilidad(boolean dispoibilidad) {
		this.dispoibilidad = dispoibilidad;
	}
	
	
}
