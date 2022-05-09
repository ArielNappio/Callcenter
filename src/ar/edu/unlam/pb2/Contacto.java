package ar.edu.unlam.pb2;

public class Contacto {

	private String nombre_Apellido;
	private String celular;
	private String email;
	private String direccion;
	private Boolean esCliente;
	private Boolean llamadoNuevamente;
	private Integer id;
	private static Integer idAumento = 0;

	public Contacto(String nombre_Apellido, String celular, String email, String direccion, Boolean esCliente,
			Boolean llamadoNuevamente) {

		this.nombre_Apellido = nombre_Apellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.esCliente = esCliente;
		this.llamadoNuevamente = llamadoNuevamente;
		this.id = idAumento++;
	}

	public String getNombre_Apellido() {
		return nombre_Apellido;
	}

	public void setNombre_Apellido(String nombre_Apellido) {
		this.nombre_Apellido = nombre_Apellido;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getLlamadoNuevamente() {
		return llamadoNuevamente;
	}

	public void setLlamadoNuevamente(Boolean llamadoNuevamente) {
		this.llamadoNuevamente = llamadoNuevamente;
	}

	public Boolean validacionDeEmail(String email) {
		if (email.contains("@") && email.contains(".")) {
			return true;
		}
		return false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Contacto [nombre_Apellido=" + nombre_Apellido + ", celular=" + celular + ", email=" + email
				+ ", direccion=" + direccion + ", esCliente=" + esCliente + ", llamadoNuevamente=" + llamadoNuevamente
				+ "]";
	}

}
