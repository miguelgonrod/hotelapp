package co.edu.javeriana.fbd.hotelapp3.model.dao;

import java.util.ArrayList;

import co.edu.javeriana.fbd.hotelapp3.model.dto.DepartamentoDTO;


public interface DepartamentoDAO {
	public DepartamentoDTO create(DepartamentoDTO depto);
	
	public DepartamentoDTO edit(int codigo, DepartamentoDTO depto);
	
	public Boolean delete(int codigo);
	
	public DepartamentoDTO findById(int codigo);
	
	public ArrayList<DepartamentoDTO> findAll();
	
	public Integer count();
}
