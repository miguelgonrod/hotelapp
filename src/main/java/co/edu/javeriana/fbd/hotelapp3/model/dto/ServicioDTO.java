package co.edu.javeriana.fbd.hotelapp3.model.dto;

import java.util.Objects;

public class ServicioDTO {
	private int codigo;
	private String descripcion;
	private int precio;

	public ServicioDTO(int codigo, String descripcion, int precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServicioDTO other = (ServicioDTO) obj;
		return codigo == other.codigo && Objects.equals(descripcion, other.descripcion) && precio == other.precio;
	}

	@Override
	public String toString() {
		return "ServicioDTO [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

}
