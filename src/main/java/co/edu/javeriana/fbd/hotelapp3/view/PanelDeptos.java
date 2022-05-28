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

import co.edu.javeriana.fbd.hotelapp3.model.dto.DepartamentoDTO;

public class PanelDeptos extends javax.swing.JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3730855864447824862L;
	protected JPanel panel;
	private JTextField textFieldCodigo;
	private JTextField textFieldNombre;
	private JTextArea textAreaDeptos;
	private JScrollPane scrollPane;
	
	private Principal principal;

	/**
	 * Create the application.
	 * @param principal 
	 */
	public PanelDeptos(Principal principal) {
		this.principal = principal;
		
		JLabel lblGestionDeptos = new JLabel("Gestionar Departamentos");
		lblGestionDeptos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDeptos.setForeground(Color.BLUE);
		lblGestionDeptos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		textAreaDeptos = new JTextArea();
		textAreaDeptos.setEditable(false);
		add(textAreaDeptos);
		
		scrollPane = new JScrollPane(textAreaDeptos, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldCodigo.setColumns(10);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldNombre.setColumns(10);
		
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
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lblGestionDeptos, GroupLayout.PREFERRED_SIZE, 442, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textFieldCodigo, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(btnInsertar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(btnBuscar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(btnRefresh, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(btnContar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
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
					.addComponent(lblGestionDeptos)
					.addGap(26)
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
							.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
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

	private void btnInicioActionPerformed(MouseEvent e) {
		this.principal.irDeptosUsuario();
		
	}

	/**
	 * Accion del boton insertar
	 * @param evento
	 */
	private void btnInsertarActionPerformed(MouseEvent e) {
		refrescar();
		try {
			int codigo = Integer.parseInt(textFieldCodigo.getText());
			DepartamentoDTO d = new DepartamentoDTO(codigo, textFieldNombre.getText().toUpperCase());
			if(this.principal.existeDepto(d)) {
				JOptionPane.showMessageDialog(null, "Ya existe un depto con ese codigo");
			}else {
				this.principal.crearDepto(d);
				JOptionPane.showMessageDialog(null, "Departamento creado");
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
	        	int d = (Integer.parseInt(textFieldCodigo.getText()));
	            if(this.principal.buscarDepto(d) != null) {
	            	DepartamentoDTO depto = new DepartamentoDTO(this.principal.buscarDepto(d).getCodigo(), this.principal.buscarDepto(d).getNombre());
	            	textAreaDeptos.append("Codigo del depto:" + depto.getCodigo() + "\n");
	            	textAreaDeptos.append("Nombre del depto:" + depto.getNombre());
	            }
	            else 
	            	JOptionPane.showMessageDialog(null, "No existe el depto");
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
		 ArrayList<DepartamentoDTO> d = this.principal.encontrarDeptos();
		 for(int i = 0; i < d.size(); i++) {
			 System.out.println(d.get(i).getNombre());
			 textAreaDeptos.append("Codigo depto: " + Integer.toString(d.get(i).getCodigo()) + "\n");
			 textAreaDeptos.append("Nombre depto: " + d.get(i).getNombre() + "\n\n");
		 }	
	}
	
	/**
	 * Accion del boton contar
	 * @param evento
	 */
	private void btnContarActionPerformed(MouseEvent e) {
		refrescar();
		ArrayList<DepartamentoDTO> d = this.principal.encontrarDeptos();
		textAreaDeptos.setText("Cantidad de departamentos en la base de datos: " + d.size());
	}

	/**
	 * Accion del boton modificar
	 * @param evento
	 */
	private void btnModificarActionPerformed(MouseEvent e) {
		refrescar();
		try {
			if(textFieldCodigo.getText().equals("")) 
				JOptionPane.showMessageDialog(null, "No ingreso un codigo");
	        else
	        {
	        	DepartamentoDTO d = new DepartamentoDTO(Integer.parseInt(textFieldCodigo.getText()), (textFieldNombre.getText()).toUpperCase());
	        	if(this.principal.buscarDepto(d.getCodigo()) != null) {
	        		if(!d.getNombre().equals(textFieldNombre.getText().toUpperCase()))
	        		{
		            	this.principal.editarDepto(d);
		            	JOptionPane.showMessageDialog(null, "El nombre del depto con codigo " + d.getCodigo() + "\nfue actualizado");
	        		}else {
	        			JOptionPane.showMessageDialog(null, "Ingreso el mismo nombre. No se actualizo");
	        		}	
	            }
	            else 
	            	JOptionPane.showMessageDialog(null, "No existe el depto");
	        }
			}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(null, "No ingreso un numero en codigo");
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
            if(this.principal.eliminarDepto(Integer.parseInt(textFieldCodigo.getText()))) 
            	JOptionPane.showMessageDialog(null, "Depto eliminado!");
            else JOptionPane.showMessageDialog(null, "No existe el depto");
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}

	public void refrescar() {
		textAreaDeptos.setText("");
	}
}
