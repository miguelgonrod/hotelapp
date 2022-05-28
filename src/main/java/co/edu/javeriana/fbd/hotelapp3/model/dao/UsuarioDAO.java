package co.edu.javeriana.fbd.hotelapp3.model.dao;

import java.util.List;

import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;



public interface UsuarioDAO {
	public UsuarioDTO create(UsuarioDTO usuario);
	
	public UsuarioDTO edit(String user, UsuarioDTO usuario);
	
	public Boolean delete(String user);
	
	public UsuarioDTO findById(String user);
	
	public List<UsuarioDTO> findAll();
	
	public Integer count();
}
