package ec.edu.ups.entidadNegocio;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbl_conductor")
@AttributeOverrides(
		value = {
				@AttributeOverride(name="cedula", column = @Column(name="cedula_cond")),
				@AttributeOverride(name="nombre", column = @Column(name="nombre_cond")),
				@AttributeOverride(name="apellido", column = @Column(name="apellido_cond")),
				@AttributeOverride(name="edad", column = @Column(name="eda_cond")),
		}
		)
public class Conductor extends Persona {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="con_codigo")
	private int codigo;
	
	@NotNull
	@Column(name="con_usuario")
	@Size(min = 4, max = 30)
	private String usuario;
	
	@NotNull
	@Column(name="con_contrasena")
	@Size(min = 4, max = 30)
	private String contrasena;

	@NotNull
	@Column(name="con_tip_licencia")
	@Size(min = 1, max = 1)
	private String tipolicencia;

	@NotNull
	@Column(name="con_color")
	@Size(min = 4, max = 30)
	private String color;

	@NotNull
	@Column(name="con_placa")
	@Size(min = 6, max = 7)
	private String placa;

	@NotNull
	@Column(name="con_capasidad")
	private int capasidad;
	
	//EAGER en las nuevas versiones no se puede tener mas de 2 e a nivel de entidades
	//paso1 
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) //paso 6 fetc lazy es consulta perezosa bajo demanda el jpa pregunta eager esto sin que pregunte consulta
	@JoinColumn(name= "con_codigo")
	private List<Ruta> rutas;
	

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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipolicencia() {
		return tipolicencia;
	}

	public void setTipolicencia(String tipolicencia) {
		this.tipolicencia = tipolicencia;
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

	public int getCapasidad() {
		return capasidad;
	}

	public void setCapasidad(int capasidad) {
		this.capasidad = capasidad;
	}

	
	
	public List<Ruta> getRutas() {
		return rutas;
	}

	public void setRutas(List<Ruta> rutas) {
		this.rutas = rutas;
	}
	
	@Override
	public String toString() {
		return "Conductor [codigo=" + codigo + ", usuario=" + usuario + ", contrasena=" + contrasena + ", tipolicencia="
				+ tipolicencia + ", color=" + color + ", placa=" + placa + ", capasidad=" + capasidad + ", rutas="
				+ rutas + "]";
	}

	//se agrego para rutas paso 2
	//mostrar las cajas de texto de rutas y que inicialice en vacio

	public void addRutas(Ruta rut){
		
		if(rutas== null) {
			rutas = new ArrayList<>();
			
		}
		this.rutas.add(rut);		
		
	}
	
	





	

	
	
	
	
	

}