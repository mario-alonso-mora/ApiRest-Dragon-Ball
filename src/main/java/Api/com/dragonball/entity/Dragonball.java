package Api.com.dragonball.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dragonball")
public class Dragonball {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	private String nombre;
	private String raza;
	private String genero;
	private String lugarDeNacimiento;
	private Integer edad;
	private String estado ;
	
	
	
	public Dragonball() {
	
	}



	public Dragonball(Integer id, String nombre, String raza, String genero, String lugarDeNacimiento, Integer edad,
			String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.genero = genero;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.edad = edad;
		this.estado = estado;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}



	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	



	

}
