package co.edu.javeriana.fbd.hotelapp3.controller;

import java.util.List;

import co.edu.javeriana.fbd.hotelapp3.model.daoImpl.UsuarioDAOImpl;
import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;


public class UsuarioBO {
	UsuarioDAOImpl udao;
	
	public boolean crear(UsuarioDTO u) {
		this.udao = new UsuarioDAOImpl();
		return this.udao.create(u) != null;
	}
	
	public boolean editar(UsuarioDTO u) {
		this.udao = new UsuarioDAOImpl();
       	return this.udao.edit(u.getUsuario(), u) != null;
	}
	
	public boolean eliminar(String u) {
		this.udao = new UsuarioDAOImpl();
        return this.udao.delete(u);
	}
	
	public UsuarioDTO encontrarPorId(UsuarioDTO u) {
	
        this.udao = new UsuarioDAOImpl();
        
        UsuarioDTO ud = udao.findById(u.getUsuario());
        
        if(ud != null) 
        	if(u.getPassword().equals(ud.getPassword())) 
        		return ud;
        return null;
	}

	public UsuarioDTO existeUsuario(String u) {
		this.udao = new UsuarioDAOImpl();
        return this.udao.findById(u);
	}
	
	public List<UsuarioDTO> encontrarTodo() {
		this.udao = new UsuarioDAOImpl();
        return this.udao.findAll();
	}
	
	public Integer contar() {
		return encontrarTodo().size();
	}
}
