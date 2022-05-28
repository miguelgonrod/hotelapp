package co.edu.javeriana.fbd.hotelapp3.view;

import java.util.ArrayList;

import co.edu.javeriana.fbd.hotelapp3.controller.DepartamentoBO;
import co.edu.javeriana.fbd.hotelapp3.controller.ServicioBO;
import co.edu.javeriana.fbd.hotelapp3.controller.UsuarioBO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.DepartamentoDTO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.ServicioDTO;
import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;

public class Principal extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4408846202758929188L;
	private PanelInicio panelInicio;
	private PanelServicios panelServicios;
	private PanelDeptos panelDeptos;

	private UsuarioBO usuarioBO;
	private DepartamentoBO departamentoBO;
	private ServicioBO servicioBO;

	private PanelRegistro panelRegistro;
	private PanelUsuario panelUsuario;
	
	private static String usuario;

	public Principal() {
		Principal.setUsuario("");
		this.setTitle("Hotelapp");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		this.setLocation(getLocation());
		this.iniciar();

		this.pack();
	}

	public static void main(String args[]) {
		new Principal();
	}

	private void iniciar() {
		this.panelInicio = new PanelInicio(this);
		this.panelInicio.setVisible(true);
		this.add(panelInicio);
		this.pack();
		this.setLocationRelativeTo(null);
	}
	
	public void registro() {
		this.panelRegistro = new PanelRegistro(this);
		this.panelRegistro.setVisible(true);
		this.add(panelRegistro);
		this.pack();
		this.setLocationRelativeTo(null);
	}

	/*
	 * Metodos de navegacion
	 */
	protected void salir() {
		System.exit(0);
	}

	void irUsuarioDeptos() {
		this.remove(panelUsuario);
		this.panelDeptos = new PanelDeptos(this);
		this.panelDeptos.setVisible(true);
		this.add(panelDeptos);
		this.setLocationRelativeTo(null);
		this.pack();
	}

	void irDeptosUsuario() {
		this.remove(panelDeptos);
		this.panelUsuario= new PanelUsuario(this, Principal.getUsuario());
		this.panelUsuario.setVisible(true);
		this.add(panelUsuario);
		this.setLocationRelativeTo(null);
		this.pack();
	}

	void irUsuarioServicios() {
		this.remove(panelUsuario);
		this.panelServicios = new PanelServicios(this);
		this.panelServicios.setVisible(true);
		this.add(panelServicios);
		this.setLocationRelativeTo(null);
		this.pack();
	}

	void irServiciosUsuario() {
		this.remove(panelServicios);
		this.panelUsuario= new PanelUsuario(this, Principal.getUsuario());
		this.panelUsuario.setVisible(true);
		this.add(panelUsuario);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
	void irInicioRegistro() {
		this.remove(panelInicio);
		this.panelRegistro = new PanelRegistro(this);
		this.panelRegistro.setVisible(true);
		this.add(panelRegistro);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
	void irRegistroInicio() {
		this.remove(panelRegistro);
		this.panelInicio = new PanelInicio(this);
		this.panelInicio.setVisible(true);
		this.add(panelInicio);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
	void irInicioUsuario(String u) {
		Principal.setUsuario(u);
		this.remove(panelInicio);
		this.panelUsuario = new PanelUsuario(this, u);
		this.panelUsuario.setVisible(true);
		this.add(panelUsuario);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
	void irUsuarioInicio() {
		this.remove(panelUsuario);
		this.panelInicio = new PanelInicio(this);
		this.panelInicio.setVisible(true);
		this.add(panelInicio);
		this.setLocationRelativeTo(null);
		this.pack();
	}
	
	/*
	 *Métodos para tabla P2_departamento 
	 */
	public void crearDepto(DepartamentoDTO d) {
		this.departamentoBO = new DepartamentoBO();
		this.departamentoBO.crear(d);
	}
	
	public boolean editarDepto(DepartamentoDTO d) {
			this.departamentoBO = new DepartamentoBO();
			return this.departamentoBO.editar(d);
	}
	
	boolean eliminarDepto(int c) {
		this.departamentoBO = new DepartamentoBO();
		return this.departamentoBO.eliminar(c);
	}
	
	public boolean existeDepto(DepartamentoDTO d) {
		this.departamentoBO = new DepartamentoBO();
		if(this.departamentoBO.encontrarPorId(d.getCodigo()) != null) {
			return true;
		}else
			return false;
	}
	
	ArrayList<DepartamentoDTO> encontrarDeptos() {
		this.departamentoBO = new DepartamentoBO();
		return this.departamentoBO.encontrarTodo();
	}
	
	public Integer contarDeptos() {
		this.departamentoBO = new DepartamentoBO();
		return this.departamentoBO.contar();
	}
	
	public DepartamentoDTO buscarDepto(int d) {
		this.departamentoBO = new DepartamentoBO();
		if(this.departamentoBO.encontrarPorId(d) != null) {
			return this.departamentoBO.encontrarPorId(d);
		}else
			return null;
	}
	
	
	/*
	 *Métodos para tabla P2_servicio
	 */
	public void crearServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
		this.servicioBO.crear(s);
	}
	
	public boolean editarServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
			return this.servicioBO.editar(s);
	}
	
	boolean eliminarServicio(int c) {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.eliminar(c);
	}
	
	public boolean existeServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
		if(this.servicioBO.encontrarPorId(s.getCodigo()) != null) {
			return true;
		}else
			return false;
	}
	
	ArrayList<ServicioDTO> encontrarServicio() {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.encontrarTodo();
	}
	
	public Integer contarServicio() {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.contar();
	}
	
	public ServicioDTO buscarServicio(int s) {
		this.servicioBO = new ServicioBO();
		if(this.servicioBO.encontrarPorId(s) != null) {
			return this.servicioBO.encontrarPorId(s);
		}else
			return null;
	}
	
	
	/*
	 *Métodos para tabla P2_login
	 */
	
	Boolean iniciarSesion(UsuarioDTO usuario) {
		this.usuarioBO = new UsuarioBO();
		UsuarioDTO u = this.usuarioBO.encontrarPorId(usuario);
		if (u != null) {
			return true;
		}
		return false;

	}
	
	Boolean registroUsuario(UsuarioDTO usuario) {
		this.usuarioBO = new UsuarioBO();
		usuarioBO.crear(usuario);
		return true;
	}

	public boolean existeUsuario(UsuarioDTO u) {
		this.usuarioBO = new UsuarioBO();
		if(this.usuarioBO.existeUsuario(u.getUsuario()) != null) {
			return true;
		}else
			return false;
	}
	
	UsuarioDTO encontrarUsuario() {
		this.usuarioBO = new UsuarioBO();
		return this.usuarioBO.existeUsuario(Principal.getUsuario());
	}
	

	
	public boolean editarUsuario(UsuarioDTO u) {
		this.usuarioBO = new UsuarioBO();
			return this.usuarioBO.editar(u);
	}
	
	boolean eliminarUsuario(String u) {
		this.usuarioBO = new UsuarioBO();
		return this.usuarioBO.eliminar(u);
	}
	/*
	ArrayList<ServicioDTO> encontrarServicio() {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.encontrarTodo();
	}
*/
	
	
	
	
	
	
	
	
	
	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		Principal.usuario = usuario;
	}
	
/*
	public void crearServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
		this.servicioBO.crear(s);
	}
	
	public boolean editarServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
			return this.servicioBO.editar(s);
	}
	
	boolean eliminarServicio(int c) {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.eliminar(c);
	}
	
	public boolean existeServicio(ServicioDTO s) {
		this.servicioBO = new ServicioBO();
		if(this.servicioBO.encontrarPorId(s.getCodigo()) != null) {
			return true;
		}else
			return false;
	}
	
	ArrayList<ServicioDTO> encontrarServicio() {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.encontrarTodo();
	}
	
	public Integer contarServicio() {
		this.servicioBO = new ServicioBO();
		return this.servicioBO.contar();
	}
	
	public ServicioDTO buscarServicio(int s) {
		this.servicioBO = new ServicioBO();
		if(this.servicioBO.encontrarPorId(s) != null) {
			return this.servicioBO.encontrarPorId(s);
		}else
			return null;
	}
	
	*/
}
