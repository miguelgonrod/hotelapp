package co.edu.javeriana.fbd.hotelapp3.model.dto;

import java.util.Objects;

public class UsuarioDTO {
	private String nombre;
	private String apellido;
	private String telefono;
	private String usuario;
	private String password;
	
	
	
	public UsuarioDTO(String usuario, String password) {
		super();
		this.usuario = usuario;
		this.password = password;
	}

	public UsuarioDTO(String nombre, String apellido, String telefono, String usuario, String password) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.usuario = usuario;
		this.password = password;
	}
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
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
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(apellido, nombre, password, telefono, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDTO other = (UsuarioDTO) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password) && Objects.equals(telefono, other.telefono)
				&& Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "UsuarioDTO [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", usuario="
				+ usuario + ", password=" + password + "]";
	}
		
}