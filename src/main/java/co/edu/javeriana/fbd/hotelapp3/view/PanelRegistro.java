package co.edu.javeriana.fbd.hotelapp3.view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelRegistro extends javax.swing.JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6701571804042733051L;

	private JTextField textFieldRUsuario;
	private JTextField textFieldRNombre;
	private JTextField textFieldRApellido;
	private JTextField textFieldRTelefono;
	private JTextField textFieldRContrasena;
	private Principal principal;


	/**
	 * Create the application.
	 */
	public PanelRegistro(Principal principal) {
		this.principal = principal;
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldRUsuario = new JTextField();
		textFieldRUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldRUsuario.setColumns(10);
		
		JLabel lblUsuario_1 = new JLabel("Nombre");
		lblUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldRNombre = new JTextField();
		textFieldRNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldRNombre.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnIniciarSesionActionPerformed(e);
			}
		});
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnRegistrarA = new JButton("Registrar");
		btnRegistrarA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegistrarAActionPerformed(e);
			}
		});
		btnRegistrarA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblUsuario_1_1 = new JLabel("Apellido");
		lblUsuario_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldRApellido = new JTextField();
		textFieldRApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldRApellido.setColumns(10);
		
		JLabel lblUsuario_1_2 = new JLabel("Telefono");
		lblUsuario_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldRTelefono = new JTextField();
		textFieldRTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldRTelefono.setColumns(10);
		
		JLabel lblUsuario_1_3 = new JLabel("Contrasena");
		lblUsuario_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldRContrasena = new JTextField();
		textFieldRContrasena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldRContrasena.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSalirActionPerformed(e);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(textFieldRUsuario, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(textFieldRNombre, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUsuario_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario_1_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(textFieldRApellido, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(textFieldRTelefono, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUsuario_1_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario_1_3, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(102)
							.addComponent(textFieldRContrasena, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnIniciarSesion, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnRegistrarA, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(textFieldRUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textFieldRNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUsuario_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario_1_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textFieldRApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textFieldRTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblUsuario_1_2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario_1_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(textFieldRContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(21)
					.addComponent(btnIniciarSesion, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(btnRegistrarA, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
	}

	private void btnSalirActionPerformed(MouseEvent e) {
		System.exit(0);
		
	}

	private void btnIniciarSesionActionPerformed(MouseEvent e) {
		this.principal.irRegistroInicio();
		
	}

	private void btnRegistrarAActionPerformed(MouseEvent e) {
		try {
			if(textFieldRUsuario.getText().equals("") || textFieldRNombre.getText().equals("") ||
					textFieldRApellido.getText().equals("") || textFieldRTelefono.getText().equals("") ||
					textFieldRContrasena.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Complete todos los espacios del formulario");
			}else {
				String u = textFieldRUsuario.getText();
				String n = textFieldRNombre.getText();
				String a = textFieldRApellido.getText();
				String t = textFieldRTelefono.getText();
				String c = textFieldRContrasena.getText();
				UsuarioDTO nuevoUsuario = new UsuarioDTO(n, a, t, u, c);
				if(this.principal.existeUsuario(nuevoUsuario)) {
					JOptionPane.showMessageDialog(null, "Ya existe un usuario con ese codigo");
				}else if(this.principal.registroUsuario(nuevoUsuario)){
					
					JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
				}
			}
		}catch(NullPointerException e2) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
		}
		
	}

}
