package co.edu.javeriana.fbd.hotelapp3.controller;

import java.util.ArrayList;

import co.edu.javeriana.fbd.hotelapp3.model.dao.DepartamentoDAO;
import co.edu.javeriana.fbd.hotelapp3.model.daoImpl.DepartamentoDAOImpl;
import co.edu.javeriana.fbd.hotelapp3.model.dto.DepartamentoDTO;



public class DepartamentoBO {
	DepartamentoDAO sdao;
	
	public boolean crear(DepartamentoDTO d) {
		this.sdao = new DepartamentoDAOImpl();
		return this.sdao.create(d) != null;
	}
	
	public boolean editar(DepartamentoDTO d) {
		this.sdao = new DepartamentoDAOImpl();
		DepartamentoDTO existeU = this.sdao.findById(d.getCodigo());
		if(existeU == null) 
			return false;
        else 
        	return this.sdao.edit(d.getCodigo(), d) != null;
	}
	
	public boolean eliminar(int d) {
		this.sdao = new DepartamentoDAOImpl();
        return this.sdao.delete(d);
	}
	
	public DepartamentoDTO encontrarPorId(int d) {
		this.sdao = new DepartamentoDAOImpl();
        return this.sdao.findById(d);
	}

	public ArrayList<DepartamentoDTO> encontrarTodo() {
		this.sdao = new DepartamentoDAOImpl();
        return this.sdao.findAll();
	}
	
	public Integer contar() {
		return encontrarTodo().size();
	}
}
