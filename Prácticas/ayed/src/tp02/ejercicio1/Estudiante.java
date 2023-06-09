package tp02.ejercicio1;

public class Estudiante {
	
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Estudiante (String unNombre, String unApellido,  String unaComision, String unEmail, String unaDireccion ) {
		this.apellido = unApellido;
		this.comision = unaComision;
		this.nombre   = unNombre;
		this.email    = unEmail;
		this.direccion= unaDireccion;
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
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		return this.toString();
	}
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", comision=" + comision + ", email=" + email
				+ ", direccion=" + direccion + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getComision()=" + getComision() + ", getEmail()=" + getEmail() + ", getDireccion()="
				+ getDireccion() + "]";
	}
}
