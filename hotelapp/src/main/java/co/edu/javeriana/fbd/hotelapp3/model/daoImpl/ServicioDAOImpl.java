package co.edu.javeriana.fbd.hotelapp3.model.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.javeriana.fbd.hotelapp3.model.dao.ServicioDAO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.ServicioDTO;
import co.edu.javeriana.fbd.hotelapp3.util.SQLDeveloper;



public class ServicioDAOImpl implements ServicioDAO {
	private final SQLDeveloper oracle;

	public ServicioDAOImpl() {
		super();
		this.oracle = new SQLDeveloper();
	}

	@Override
	public ServicioDTO create(ServicioDTO servicio) {
		try {
			this.oracle.conectar();
			String query = "INSERT INTO p2_servicio(codigo, descripcion, precio) VALUES(" + "'" + servicio.getCodigo()
					+ "'," + "'" + servicio.getDescripcion() + "'," + "'" + servicio.getPrecio() + "')";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
			switch (code) {
			case 1:
				System.out.println("Se creo el servicio de la cadena de hoteles");
				return findById(servicio.getCodigo());
			default:
				return null;
			}
		} catch (SQLException e) {
			Logger.getLogger(ServicioDAOImpl.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
	}

	@Override
	public ServicioDTO edit(int codigo, ServicioDTO servicio) {
		try {
			String query = new String();
			if(servicio.getDescripcion().equals("")) {
				query = "UPDATE P2_servicio SET " + " precio = " + servicio.getPrecio() + 
						" WHERE codigo = "+ codigo;
			}else if(servicio.getPrecio() == -1){
				query = "UPDATE P2_servicio SET " + " descripcion = '" + servicio.getDescripcion() + 
						"' WHERE codigo = "+ codigo;
			}else {
				query = "UPDATE P2_servicio SET " + " precio = " + servicio.getPrecio() +
						", descripcion = '" + servicio.getDescripcion() + 
						"' WHERE codigo = "+ codigo;
				System.out.println("Hola Mundo");
			}
			this.oracle.conectar();
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			stmt.executeUpdate(query);
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
			switch (code) {
			case 1:
				System.out.println("Se actualizo el servicio");
				return findById(servicio.getCodigo());
			default:
				return null;
			}
		} catch (SQLException e) {
			Logger.getLogger(ServicioDAOImpl.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
	}

	@Override
	public Boolean delete(int codigo) {
		try {
			this.oracle.conectar();
			String query = "DELETE FROM P2_servicio WHERE codigo = " + codigo;
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
			switch (code) {
			case 1:
				System.out.println("Se elimino el departamento");
				return true;
			default:
				return false;
			}

		} catch (SQLException ex) {
			Logger.getLogger(ServicioDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
			return null;
		}
	}

	@Override
	public ServicioDTO findById(int codigo) {
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM P2_servicio WHERE codigo = " + codigo;
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query);
			if (rs.first()) {
				ServicioDTO servicio = new ServicioDTO(
													rs.getInt("CODIGO"), 
													rs.getString("DESCRIPCION"),
													rs.getInt("PRECIO")
										);
				rs.close();
				stmt.close();
				this.oracle.desconectar();
				System.out.println("Se obtuvo el servicio");
				return servicio;
			}else {
				rs.close();
				stmt.close();
				this.oracle.desconectar();
				return null;
			}
		} catch(SQLException ex) {
            Logger.getLogger(ServicioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
		}
	}

	@Override
	public ArrayList<ServicioDTO> findAll() {
		ArrayList<ServicioDTO> servicios = new ArrayList<>();
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM p2_servicio";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
            	ServicioDTO  servicio = new ServicioDTO(
						rs.getInt("CODIGO"), 
						rs.getString("DESCRIPCION"), 
						rs.getInt("precio")
				);
            	servicios.add(servicio);
            }	
			rs.close();
			stmt.close();
			this.oracle.desconectar();
			return servicios;
		} catch (SQLException ex){
            Logger.getLogger(ServicioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
	}

	@Override
	public Integer count() {
		return findAll().size();
	}

}
