package co.edu.javeriana.fbd.hotelapp3.controller;

import java.util.ArrayList;

import co.edu.javeriana.fbd.hotelapp3.model.dao.ServicioDAO;
import co.edu.javeriana.fbd.hotelapp3.model.daoImpl.ServicioDAOImpl;
import co.edu.javeriana.fbd.hotelapp3.model.dto.ServicioDTO;



public class ServicioBO {
	ServicioDAO sdao;
	
	public boolean crear(ServicioDTO s) {
		this.sdao = new ServicioDAOImpl();
		return this.sdao.create(s) != null;
	}
	
	public boolean editar(ServicioDTO s) {
		this.sdao = new ServicioDAOImpl();
		ServicioDTO existeU = this.sdao.findById(s.getCodigo());
		if(existeU == null) 
			return false;
        else 
        	return this.sdao.edit(s.getCodigo(), s) != null;
	}
	
	public boolean eliminar(int s) {
		this.sdao = new ServicioDAOImpl();
        return this.sdao.delete(s);
	}
	
	public ServicioDTO encontrarPorId(int s) {
		this.sdao = new ServicioDAOImpl();
        return this.sdao.findById(s);
	}

	public ArrayList<ServicioDTO> encontrarTodo() {
		this.sdao = new ServicioDAOImpl();
        return this.sdao.findAll();
	}
	
	public Integer contar() {
		return encontrarTodo().size();
	}
}
