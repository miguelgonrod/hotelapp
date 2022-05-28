package co.edu.javeriana.fbd.hotelapp3.model.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.javeriana.fbd.hotelapp3.model.dao.UsuarioDAO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;
import co.edu.javeriana.fbd.hotelapp3.util.SQLDeveloper;



public class UsuarioDAOImpl implements UsuarioDAO{
	private final SQLDeveloper oracle;

	public UsuarioDAOImpl() {
		super();
		this.oracle = new SQLDeveloper();
	}

	@Override
	public UsuarioDTO create(UsuarioDTO usuario) {
        try {
            this.oracle.conectar();
            String query = "INSERT INTO P2_login VALUES("
					+ "'" + usuario.getNombre() + "', "
					+ "'" + usuario.getApellido() + "', "
					+ "'" + usuario.getTelefono() + "', "
					+ "'" + usuario.getUsuario() + "', "
					+ "'" + usuario.getPassword() + "')";					
            System.out.println(query);
            Statement stmt = this.oracle.getConnection().createStatement();
            int code = stmt.executeUpdate(query);
            stmt.close();
            this.oracle.desconectar();
            switch (code) {
            case 1:
                System.out.println("Se creo la persona");
                return findById(usuario.getUsuario());
            default:
                return null;
        }
        
    } catch (SQLException ex){
        Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
        return null;
    }
}

	@Override
	public UsuarioDTO edit(String user, UsuarioDTO usuario)  {
		try {
			this.oracle.conectar();
			String query =  "UPDATE P2_login SET "
					+ "nombre = '" + usuario.getNombre() + "', "
					+ "apellido = '" + usuario.getApellido() + "', "
					+ "telefono = '" + usuario.getTelefono() + "', "
					+ "usuario = '" + usuario.getUsuario() + "', "
					+ "password = '" + usuario.getPassword() + "' "
					+ "WHERE usuario = '" + user + "'";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			stmt.executeUpdate(query); 
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
            switch (code) {
            case 1:
                System.out.println("Se edito al usuario");
                return findById(usuario.getUsuario());
            default:
                return null;
        }
        
    } catch (SQLException ex){
        Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
        return null;
    }
}

	@Override
	public Boolean delete(String user) {
		try {
			this.oracle.conectar();
			String query = "DELETE FROM P2_login WHERE usuario = '" + user + "'";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			stmt.executeUpdate(query);
			int code = stmt.executeUpdate(query);
			stmt.close();
			this.oracle.desconectar();
            switch (code) {
            case 1:
                System.out.println("Se elimino la persona");
                return true;
            default:
                return false;
        }
        
	    } catch (SQLException ex){
	        Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
	        return null;
	    }
	}

	@Override
	public UsuarioDTO findById(String user) {
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM P2_login WHERE usuario = '" + user + "'";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery(query);
			if(rs.first()) {
				UsuarioDTO usuario = new UsuarioDTO(
										rs.getString("nombre"),
										rs.getString("apellido"),
										rs.getString("telefono"),
										rs.getString("usuario"),
										rs.getString("password")
									);
				rs.close();
				stmt.close();
				this.oracle.desconectar();
				System.out.println("Se obtuvo el usuario");
				return usuario;
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
	public List<UsuarioDTO> findAll() {
		List<UsuarioDTO> usuarios = new ArrayList<>();
		try {
			this.oracle.conectar();
			String query = "SELECT * FROM P2_login";
			System.out.println(query);
			Statement stmt = this.oracle.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(query);
			if(!rs.next()) 
				return null;
            rs.previous();
            do
            {
            	rs.next();
            	UsuarioDTO usuario = new UsuarioDTO(
											rs.getString("nombre"),
											rs.getString("apellido"),
											rs.getString("telefono"),
											rs.getString("usuario"),
											rs.getString("password")
									);
            	usuarios.add(usuario);
            } while(!rs.isLast()); 
			rs.close();
			stmt.close();
			this.oracle.desconectar();
			System.out.println("Se obtuvieron todos los usuarios");
			return usuarios;
		} catch (SQLException ex){
            Logger.getLogger(UsuarioDAOImpl.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
	}

	@Override
	public Integer count() {
		return findAll().size();
	}
	
}
