package co.edu.javeriana.fbd.hotelapp3.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import co.edu.javeriana.fbd.hotelapp3.model.dto.ServicioDTO;

public class PanelServicios extends javax.swing.JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9006849613908642974L;
	protected JPanel panel;
	private JTextField textFieldCodigo;
	private JTextField textFieldDescripcion;
	private JTextField textFieldPrecio;
	private JTextArea textAreaServicios;
	private JScrollPane scrollPane;
	
	private Principal principal;

	/**
	 * Create the application.
	 * @param principal 
	 */
	public PanelServicios(Principal principal) {
		
		this.principal = principal;
		
		JLabel lblGestionDeptos = new JLabel("Gestión Servicios");
		lblGestionDeptos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeptos.setForeground(Color.BLUE);
		lblGestionDeptos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textAreaServicios = new JTextArea();
		textAreaServicios.setEditable(false);
		add(textAreaServicios);
		
		scrollPane = new JScrollPane(textAreaServicios, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel lblNewLabel = new JLabel("Descripcion");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCodigo.setColumns(10);
		
		textFieldDescripcion = new JTextField();
		textFieldDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldDescripcion.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnInsertarActionPerformed(e);
			}
		});
		btnInsertar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnBuscarActionPerformed(e);
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRefreshActionPerformed(e);
			}
		});
		btnRefresh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnContar = new JButton("Contar");
		btnContar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnContarActionPerformed(e);
			}
		});
		btnContar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnModificarActionPerformed(e);
			}
		});
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnEliminarActionPerformed(e);
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnSalirActionPerformed(e);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnInicio = new JButton("Ir a inicio");
		btnInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnInicioActionPerformed(e);
			}
		});
		btnInicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldPrecio.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(lblGestionDeptos, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(textFieldDescripcion, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblPrecio, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textFieldPrecio, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(btnInsertar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnContar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(btnInicio, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(5)
					.addComponent(lblGestionDeptos)
					.addGap(21)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldDescripcion, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPrecio, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(textFieldPrecio, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnInsertar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnContar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnInicio, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
		);
		setLayout(groupLayout);
		initialize();
	}

	/**
	 * Accion del boton insertar
	 * @param evento
	 */
	private void btnInsertarActionPerformed(MouseEvent e) {
		refrescar();
		try {
			int codigo = Integer.parseInt(textFieldCodigo.getText());
			ServicioDTO s = new ServicioDTO(codigo, textFieldDescripcion.getText().toUpperCase(), Integer.parseInt(textFieldPrecio.getText()));
			if(this.principal.existeServicio(s)) {
				JOptionPane.showMessageDialog(null, "Ya existe un servicio con ese codigo");
			}else {
				this.principal.crearServicio(s);
				JOptionPane.showMessageDialog(null, "Servicio creado");
			}
		}catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "No ingreso un numero en codigo");
		}
	}
	
	/**
	 * Accion del boton buscar
	 * @param evento
	 */
	private void btnBuscarActionPerformed(MouseEvent e) {
		refrescar();
		try {
			if(textFieldCodigo.getText().equals("")) 
				JOptionPane.showMessageDialog(null, "No ingreso un codigo");
	        else
	        {
	        	int s = (Integer.parseInt(textFieldCodigo.getText()));
	            if(this.principal.buscarServicio(s) != null) {
	            	ServicioDTO servicio = new ServicioDTO(
								            			this.principal.buscarServicio(s).getCodigo(), 
								            			this.principal.buscarDepto(s).getNombre(), 
								            			this.principal.buscarServicio(s).getPrecio()
	            										);
	            	textAreaServicios.append("Codigo del servicio: " + servicio.getCodigo() + "\n");
	            	textAreaServicios.append("Descripcion del servicio: " + servicio.getDescripcion() + "\n");
	            	textAreaServicios.append("Precio del servicio: " + servicio.getPrecio());
	            }
	            else 
	            	JOptionPane.showMessageDialog(null, "No existe el servicio");
	        }
			}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "No ingreso un numero en codigo");
			}catch(NullPointerException e2) {
				JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
			}		
	}
	
	/**
	 * Accion del boton refrescar
	 * @param e
	 */
	private void btnRefreshActionPerformed(MouseEvent e) {
		refrescar();
		 ArrayList<ServicioDTO> s = this.principal.encontrarServicio();
		 for(int i = 0; i < s.size(); i++) {
			 System.out.println(s.get(i).getDescripcion());
			 textAreaServicios.append("Codigo del servicio: " + Integer.toString(s.get(i).getCodigo()) + "\n");
			 textAreaServicios.append("Descripcion del servicio: " + s.get(i).getDescripcion() + "\n");
			 textAreaServicios.append("Precio del servicio: " + s.get(i).getPrecio() + "\n\n");
		 }	
	}
	
	/**
	 * Accion del boton contar
	 * @param evento
	 */
	private void btnContarActionPerformed(MouseEvent e) {
		refrescar();
		ArrayList<ServicioDTO> s = this.principal.encontrarServicio();
		textAreaServicios.setText("Cantidad de servicios en la base de datos: " + s.size());
	}

	/**
	 * Accion del boton modificar
	 * @param evento
	 */
	private void btnModificarActionPerformed(MouseEvent e) {
		refrescar();
		int c = 0;
		String d = new String();
		int p = 0;
		try {
			if(textFieldCodigo.getText().equals("")) 
				JOptionPane.showMessageDialog(null, "No ingreso un codigo");
	        else
	        {
	        	System.out.println("Cod obt: " + Integer.parseInt(textFieldCodigo.getText()));
		        	c = (Integer.parseInt(textFieldCodigo.getText()));
		            if(this.principal.buscarServicio(c) != null) {
		            	ServicioDTO servicio = new ServicioDTO(
									            			this.principal.buscarServicio(c).getCodigo(), 
									            			this.principal.buscarDepto(c).getNombre(), 
									            			this.principal.buscarServicio(c).getPrecio()
		            										);
		            	d = textFieldDescripcion.getText().toUpperCase();
		            	if(textFieldPrecio.getText().equals("")) {
		            		p = servicio.getPrecio();
		            	}else {
		            		p = Integer.parseInt(textFieldPrecio.getText());
		            	}
		            	ServicioDTO servicioCambios = new ServicioDTO(c, d, p);
		            	this.principal.editarServicio(servicioCambios);
		            JOptionPane.showMessageDialog(null, "El servicio con codigo " + servicioCambios.getCodigo() + "\nfue actualizado");
	        	}else if(textFieldPrecio.getText().equals("") && textFieldDescripcion.getText().equals("")){
	        		JOptionPane.showMessageDialog(null, "No ingreso algun dato para actualizar");
	        	}else 
	            	JOptionPane.showMessageDialog(null, "No existe el servicio");
	        }
			}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "No ingreso un dato numerico");
			}catch(NullPointerException e2) {
				JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
			}	
	}
	
	/**
	 * Acción del boton eliminar
	 * @param evento
	 */
	private void btnEliminarActionPerformed(MouseEvent e) {
		refrescar();
		try {
		if(textFieldCodigo.getText().equals("")) 
			JOptionPane.showMessageDialog(null, "No ingreso un codigo");
        else
        {
            if(this.principal.eliminarServicio(Integer.parseInt(textFieldCodigo.getText()))) 
            	JOptionPane.showMessageDialog(null, "servicio eliminado!");
            else JOptionPane.showMessageDialog(null, "No existe el servicio");
            refrescar();
        }
		}catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "No ingreso un numero en codigo");
		}catch(NullPointerException e2) {
			JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la base de datos");
		}
	}
	
	/**
	 * Accion del boton salir
	 * @param evento
	 */
	private void btnSalirActionPerformed(MouseEvent e) {
		System.exit(0);
	}
	
	private void btnInicioActionPerformed(MouseEvent e) {
		this.principal.irServiciosUsuario();
	}
	
	public void refrescar() {
		textAreaServicios.setText("");
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	}
}