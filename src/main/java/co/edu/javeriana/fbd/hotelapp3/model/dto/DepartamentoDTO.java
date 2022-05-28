package co.edu.javeriana.fbd.hotelapp3.model.dto;

public class DepartamentoDTO {
	private int codigo;
	private String nombre;
	
	/**
	 * 
	 * @param codigo
	 * @param nombre
	 */
	public DepartamentoDTO(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
