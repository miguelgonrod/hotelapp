package co.edu.javeriana.fbd.hotelapp3.model.dao;

import java.util.ArrayList;

import co.edu.javeriana.fbd.hotelapp3.model.dto.ServicioDTO;

public interface ServicioDAO {
	public ServicioDTO create(ServicioDTO servicio);
	
	public ServicioDTO edit(int codigo, ServicioDTO servicio);
	
	public Boolean delete(int codigo);
	
	public ServicioDTO findById(int codigo);
	
	public ArrayList<ServicioDTO> findAll();
	
	public Integer count();
}
