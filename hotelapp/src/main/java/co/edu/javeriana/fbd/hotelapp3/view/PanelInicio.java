package co.edu.javeriana.fbd.hotelapp3.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import co.edu.javeriana.fbd.hotelapp3.model.dto.UsuarioDTO;




public class PanelInicio extends javax.swing.JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1624658316668914769L;
	private JTextField textFieldUsuario;
	private JTextField textFieldPassword;


	private Principal principal;
	private UsuarioDTO usuario = null;

	/**
	 * Create the application.
	 */
	public PanelInicio(Principal principal) {
		this.principal = principal;
		
		initializeLogin();
		//initializeRegistro();
		//initializeMetodos();
	}
	
	private void initializeLogin() {
		JLabel lblGestionDeptos = new JLabel("Hotelapp");
		lblGestionDeptos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeptos.setForeground(Color.BLUE);
		lblGestionDeptos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblPassword = new JLabel("Contrase\u00F1a");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUsuario.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPassword.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnIniciarSesionActionPerformed(e);
			}
		});
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegistrarActionPerformed(e);
			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		setLayout(null);
		
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
					.addGap(7)
					.addComponent(lblGestionDeptos, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addComponent(textFieldPassword, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(btnIniciarSesion, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(lblGestionDeptos)
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUsuario, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addComponent(btnIniciarSesion, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		

	}

	private void btnRegistrarActionPerformed(MouseEvent e) {
		this.principal.irInicioRegistro();
	}

	private void btnIniciarSesionActionPerformed(MouseEvent e) {
		try {
		if(textFieldUsuario.getText().equals("") || textFieldPassword.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Falta usuario o contrasena");
		else {
			this.usuario = new UsuarioDTO(textFieldUsuario.getText(), textFieldPassword.getText());
			if(this.principal.iniciarSesion(usuario)) {
				JOptionPane.showMessageDialog(null, "Inicio Sesion");
				this.principal.irInicioUsuario(usuario.getUsuario());
			}
			else
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
		}
		}catch(NullPointerException e2) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
		}
		
	}

	private void btnSalirActionPerformed(MouseEvent e) {
		System.exit(0);
	}
		
}
