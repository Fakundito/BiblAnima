package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Presentacion extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreAltaUsuario;
	private JTextField textApellidoAltaUsuario;
	private JTextField textMailAltaUsuario;
	private JTextField textContrasenaAltaUsuario;
	private JTextField textCIAltaUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentacion frame = new Presentacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Presentacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAlta = new JMenu("Alta");
		menuBar.add(mnAlta);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Configurar = new JPanel();
		Configurar.setBounds(0, 0, 434, 316);
		contentPane.add(Configurar);
		Configurar.setLayout(null);
		Configurar.setVisible(false);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(162, 53, 112, 20);
		Configurar.add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 97, 86, 20);
		Configurar.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(258, 97, 86, 20);
		Configurar.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(108, 155, 86, 20);
		Configurar.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(258, 155, 86, 20);
		Configurar.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(162, 216, 112, 20);
		Configurar.add(comboBox_2);
		
		JButton btnAceptar_1 = new JButton("Aceptar");
		btnAceptar_1.setBounds(315, 267, 89, 23);
		Configurar.add(btnAceptar_1);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setBounds(27, 267, 89, 23);
		Configurar.add(btnCancelar_1);
		
		JPanel Consulta = new JPanel();
		Consulta.setBounds(0, 0, 434, 316);
		contentPane.add(Consulta);
		Consulta.setLayout(null);
		Consulta.setVisible(false);
		
		JPanel Informacion = new JPanel();
		Informacion.setBounds(0, 92, 434, 224);
		Consulta.add(Informacion);
		Informacion.setLayout(null);
		Informacion.setVisible(false);
		
		JLabel lblNombre_1 = new JLabel("Ejemplo Nombre");
		lblNombre_1.setBounds(109, 33, 77, 14);
		Informacion.add(lblNombre_1);
		
		JLabel lblApellido_1 = new JLabel("Ejemplo Apellido");
		lblApellido_1.setBounds(109, 102, 77, 14);
		Informacion.add(lblApellido_1);
		
		JLabel lblMail_1 = new JLabel("Ejemplo Mail");
		lblMail_1.setBounds(109, 172, 77, 14);
		Informacion.add(lblMail_1);
		
		JPanel Todos = new JPanel();
		Todos.setBounds(0, 0, 434, 92);
		Consulta.add(Todos);
		Todos.setLayout(null);
		Todos.setVisible(false);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(164, 61, 103, 20);
		Todos.add(comboBox);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(108, 64, 46, 14);
		Todos.add(lblUsuario);
		
		JPanel PorCI = new JPanel();
		PorCI.setBounds(0, 0, 434, 92);
		Consulta.add(PorCI);
		PorCI.setLayout(null);
		PorCI.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(119, 61, 86, 20);
		PorCI.add(textField);
		textField.setColumns(10);
		
		JButton btnCIAceptar = new JButton("Aceptar");
		btnCIAceptar.setBounds(244, 60, 89, 23);
		PorCI.add(btnCIAceptar);
		
		JLabel lblCi_1 = new JLabel("CI:");
		lblCi_1.setBounds(68, 64, 46, 14);
		PorCI.add(lblCi_1);
		
		JPanel AltaUsuario = new JPanel();
		AltaUsuario.setBounds(0, 0, 434, 316);
		contentPane.add(AltaUsuario);
		AltaUsuario.setLayout(null);
		AltaUsuario.setVisible(false);
		
		textCIAltaUsuario = new JTextField();
		textCIAltaUsuario.setBounds(184, 54, 114, 20);
		AltaUsuario.add(textCIAltaUsuario);
		textCIAltaUsuario.setColumns(10);
		
		textNombreAltaUsuario = new JTextField();
		textNombreAltaUsuario.setBounds(184, 85, 114, 20);
		AltaUsuario.add(textNombreAltaUsuario);
		textNombreAltaUsuario.setColumns(10);
		
		textApellidoAltaUsuario = new JTextField();
		textApellidoAltaUsuario.setColumns(10);
		textApellidoAltaUsuario.setBounds(184, 116, 114, 20);
		AltaUsuario.add(textApellidoAltaUsuario);
		
		textMailAltaUsuario = new JTextField();
		textMailAltaUsuario.setColumns(10);
		textMailAltaUsuario.setBounds(184, 147, 114, 20);
		AltaUsuario.add(textMailAltaUsuario);
		
		textContrasenaAltaUsuario = new JTextField();
		textContrasenaAltaUsuario.setColumns(10);
		textContrasenaAltaUsuario.setBounds(184, 178, 114, 20);
		AltaUsuario.add(textContrasenaAltaUsuario);
		
		JComboBox comboBoxAltaUsuario = new JComboBox();
		comboBoxAltaUsuario.setBounds(184, 209, 114, 20);
		AltaUsuario.add(comboBoxAltaUsuario);
		
		JLabel lblCi = new JLabel("CI");
		lblCi.setBounds(104, 57, 46, 14);
		AltaUsuario.add(lblCi);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(104, 88, 46, 14);
		AltaUsuario.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(104, 119, 46, 14);
		AltaUsuario.add(lblApellido);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setBounds(104, 150, 46, 14);
		AltaUsuario.add(lblMail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(104, 181, 70, 14);
		AltaUsuario.add(lblContrasea);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(128, 212, 46, 14);
		AltaUsuario.add(lblTipo);
		
		JLabel lblAltaUsuario = new JLabel("Alta Usuario");
		lblAltaUsuario.setBounds(170, 11, 70, 32);
		AltaUsuario.add(lblAltaUsuario);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(300, 265, 89, 23);
		AltaUsuario.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(45, 265, 89, 23);
		AltaUsuario.add(btnCancelar);
		
		JMenuItem mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consulta.setVisible(false);
				Informacion.setVisible(false);
				Todos.setVisible(false);
				PorCI.setVisible(false);
				AltaUsuario.setVisible(true);
				Configurar.setVisible(false);
			}
		});
		mnAlta.add(mntmUsuario);
		
		JMenu mnConsulta = new JMenu("Consulta");
		menuBar.add(mnConsulta);
		
		JMenuItem mntmTodos = new JMenuItem("Todos");
		mntmTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta.setVisible(true);
				Informacion.setVisible(true);
				Todos.setVisible(true);
				PorCI.setVisible(false);
				AltaUsuario.setVisible(false);
				Configurar.setVisible(false);
			}
		});
		mnConsulta.add(mntmTodos);
		
		JMenuItem mntmPorCi = new JMenuItem("Por CI");
		mntmPorCi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consulta.setVisible(true);
				Informacion.setVisible(true);
				Todos.setVisible(false);
				PorCI.setVisible(true);
				AltaUsuario.setVisible(false);
				Configurar.setVisible(false);
			}
		});
		mnConsulta.add(mntmPorCi);
		
		JMenu mnEditar = new JMenu("Editar");
		menuBar.add(mnEditar);
		
		JMenuItem mntmEditarUsuarios = new JMenuItem("Editar Usuarios");
		mntmEditarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consulta.setVisible(false);
				Informacion.setVisible(false);
				Todos.setVisible(false);
				PorCI.setVisible(true);
				AltaUsuario.setVisible(false);
				Configurar.setVisible(true);
			}
		});
		mnEditar.add(mntmEditarUsuarios);
	}
}
