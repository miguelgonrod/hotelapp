package co.edu.javeriana.fbd.hotelapp3.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelUsuario extends javax.swing.JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8607232517125738225L;
	private Principal principal;
	private final String usuario;
	private JTextField textFieldUTelefono;
	private JTextField textFieldUContrasena;
	private JTextArea textAreaUUsuario;
	private JTextArea textAreaUNombre;
	private JTextArea textAreaUTelefono;
	private JTextArea textAreaUApellido;
	private JTextArea textAreaUContrasena;
	/**
	 * Create the application.
	 */
	public PanelUsuario(Principal principal, String usuario) {
		this.principal = principal;
		this.usuario = usuario;
		
		JLabel lblGestionDeptos = new JLabel("Hotelapp");
		lblGestionDeptos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeptos.setForeground(Color.BLUE);
		lblGestionDeptos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblUTelefono_E = new JLabel("Telefono");
		lblUTelefono_E.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldUTelefono = new JTextField();
		textFieldUTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUTelefono.setColumns(10);
		
		textFieldUContrasena = new JTextField();
		textFieldUContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUContrasena.setColumns(10);
		
		JLabel lblUPassword_E = new JLabel("Contrasena");
		lblUPassword_E.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnUGestionardeptos = new JButton("GestionarDeptos");
		btnUGestionardeptos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGestionarDeptosActionPerformed(e);
			}
		});
		btnUGestionardeptos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnUGestionarservicios = new JButton("GestionarServicios");
		btnUGestionarservicios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnGestionarServiciosActionPerformed(e);
			}
		});
		btnUGestionarservicios.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnUCerrarsesion = new JButton("CerrarSesion");
		btnUCerrarsesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCerrarSesionActionPerformed(e);
			}
		});
		btnUCerrarsesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblUUsuario = new JLabel("Usuario");
		lblUUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblUNombre = new JLabel("Nombre");
		lblUNombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblUApellido = new JLabel("Apellido");
		lblUApellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnUModificar = new JButton("Modificar");
		btnUModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnModificarActionPerformed(e);
			}
		});
		btnUModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnUEliminar = new JButton("Eliminar");
		btnUEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEliminarActionPerformed(e);
			}
		});
		btnUEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblUTelefono = new JLabel("Telefono");
		lblUTelefono.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textAreaUUsuario = new JTextArea();
		textAreaUUsuario.setForeground(Color.RED);
		textAreaUUsuario.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaUUsuario.setEditable(false);
		
		textAreaUNombre = new JTextArea();
		textAreaUNombre.setForeground(Color.RED);
		textAreaUNombre.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaUNombre.setEditable(false);
		
		textAreaUTelefono = new JTextArea();
		textAreaUTelefono.setForeground(Color.RED);
		textAreaUTelefono.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaUTelefono.setEditable(false);
		
		textAreaUApellido = new JTextArea();
		textAreaUApellido.setForeground(Color.RED);
		textAreaUApellido.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaUApellido.setEditable(false);
		
		textAreaUContrasena = new JTextArea();
		textAreaUContrasena.setForeground(Color.RED);
		textAreaUContrasena.setFont(new Font("Arial", Font.PLAIN, 17));
		textAreaUContrasena.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUUsuario, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGestionDeptos, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUNombre, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(textAreaUNombre, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(textAreaUTelefono, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUTelefono, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(textAreaUApellido, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(91)
							.addComponent(textAreaUUsuario, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUApellido, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblContrasena, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(textAreaUContrasena, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblUTelefono_E, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textFieldUTelefono, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblUPassword_E, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textFieldUContrasena, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(btnUModificar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnUEliminar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnUGestionardeptos, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnUGestionarservicios, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnUCerrarsesion, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(lblUUsuario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblGestionDeptos)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(64)
							.addComponent(lblUNombre, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(74)
							.addComponent(textAreaUNombre, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(134)
							.addComponent(textAreaUTelefono, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(131)
							.addComponent(lblUTelefono, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(textAreaUApellido, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(textAreaUUsuario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(98)
							.addComponent(lblUApellido, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblContrasena, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(textAreaUContrasena, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUTelefono_E, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldUTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUPassword_E, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldUContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUModificar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUEliminar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(btnUGestionardeptos, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(btnUGestionarservicios, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnUCerrarsesion, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		refrescar();
	}
	
	private void btnCerrarSesionActionPerformed(MouseEvent e) {
		this.principal.irUsuarioInicio();
		
	}

	private void btnEliminarActionPerformed(MouseEvent e) {
		this.principal.eliminarUsuario(usuario);
		this.principal.irUsuarioInicio();
		
	}

	private void btnModificarActionPerformed(MouseEvent e) {
		String t = textFieldUTelefono.getText();
		String p = textFieldUContrasena.getText();
		try {
			if(t.equals("") && p.equals("")) {
				JOptionPane.showMessageDialog(null, "No ingreso datos para modificar");
			}else {
				UsuarioDTO user = this.principal.encontrarUsuario();
				UsuarioDTO usuarioCambios = new UsuarioDTO();
				if(t.equals(""))
					usuarioCambios = new UsuarioDTO(
													user.getNombre(), 
													user.getApellido(), 
													user.getTelefono(), 
													user.getUsuario(), 
													p
													);
				else if (p.equals(""))
					usuarioCambios = new UsuarioDTO(
							user.getNombre(), 
							user.getApellido(), 
							t, 
							user.getUsuario(), 
							user.getPassword()
							);
				this.principal.editarUsuario(usuarioCambios);
				JOptionPane.showMessageDialog(null, "Información modificada");
			}
		}catch(NullPointerException e2) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
		}				
		refrescar();
		
	}

	private void btnGestionarDeptosActionPerformed(MouseEvent e) {
		this.principal.irUsuarioDeptos();
		
	}

	private void btnGestionarServiciosActionPerformed(MouseEvent e) {
		this.principal.irUsuarioServicios();
	}

	private void refrescar() {
		UsuarioDTO user = this.principal.encontrarUsuario();
		textAreaUUsuario.setText(user.getUsuario());
		textAreaUNombre.setText(user.getNombre());
		textAreaUApellido.setText(user.getApellido());
		textAreaUTelefono.setText(user.getTelefono());
		textAreaUContrasena.setText(user.getPassword());
	}
	
	public String getUsuario() {
		return usuario;
	}
}
