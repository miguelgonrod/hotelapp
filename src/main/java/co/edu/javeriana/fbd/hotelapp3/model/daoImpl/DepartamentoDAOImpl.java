package co.edu.javeriana.fbd.hotelapp3.model.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.javeriana.fbd.hotelapp3.model.dao.DepartamentoDAO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.DepartamentoDTO;
import co.edu.javeriana.fbd.hotelapp3.util.SQLDeveloper;

public class DepartamentoDAOImpl implements DepartamentoDAO{
	private final SQLDeveloper oracle;
	public DepartamentoDAOImpl() {
		super();
		this.oracle = new SQLDeveloper();
	}
	
	@Override
	public DepartamentoDTO create(DepartamentoDTO depto) {
        try {
            this.oracle.conectar();
            String query = "INSERT INTO P2_Departamento(codigo, nombre) VALUES("
                    + "'" + depto.getCodigo() + "',"
                    + "'" + depto.getNombre() + "')";
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code) {
                case 1:
                    System.out.println("Se creo el departamento de la cadena de hoteles");
                    return findById(depto.getCodigo());
                default:
                    return null;
            }
            
        } catch (SQLException ex){
            Logger.getLogger(DepartamentoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
	}

	@Override
	public DepartamentoDTO edit(int codigo, DepartamentoDTO depto) {
		try {
			this.oracle.conectar();
			String query =  "UPDATE P2_departamento SET "
					+ "nombre = '" + depto.getNombre() + "'"
					+ "WHERE codigo = " + codigo;
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			stmt.executeUpdate(query); 
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
			switch (code) {
            case 1:
            	System.out.println("Se actualizo el departamento");
            	return findById(depto.getCodigo());
            default:
                return null;
        }
        
    } catch (SQLException ex){
        Logger.getLogger(DepartamentoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
        return null;
    }
	}
	
	@Override
	public Boolean delete(int codigo) {
		try {
			this.oracle.conectar();
			String query = "DELETE FROM P2_departamento WHERE codigo = " + codigo;
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
			System.out.println("Codigo prueba: " + code);
            switch (code) {
            case 1:          
                return true;
            default:
                return false;
        }
        
	    } catch (SQLException ex){
	        Logger.getLogger(DepartamentoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
	        return null;
	    }
	}

	@Override
	public DepartamentoDTO findById(int codigo) {
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM P2_departamento WHERE codigo = " + codigo;
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query);
			if(rs.first()) {
				DepartamentoDTO depto = new DepartamentoDTO(
												rs.getInt("codigo"), 
												rs.getString("nombre")
										);
				rs.close();
				stmt.close();
				this.oracle.desconectar();
				System.out.println("Se obtuvo el departamento");
				return depto;
			}else {
				rs.close();
				stmt.close();
				this.oracle.desconectar();
				return null;
			}
		} catch(SQLException ex) {
            Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
		}
	}

	@Override
	public ArrayList<DepartamentoDTO> findAll() {
		ArrayList<DepartamentoDTO> deptos = new ArrayList<>();
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM P2_Departamento";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				DepartamentoDTO depto = new DepartamentoDTO(
													rs.getInt("codigo"), 
													rs.getString("nombre")
											);
				deptos.add(depto);
            }
			rs.close();
			stmt.close();
			this.oracle.desconectar();
			System.out.println("Se obtuvieron todos los departamentos ");
			System.out.println(deptos);
			return deptos;
		} catch (SQLException ex){
            Logger.getLogger(DepartamentoDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return new ArrayList<>();
        }
	}

	@Override
	public Integer count() {
		return findAll().size();
	}

}
