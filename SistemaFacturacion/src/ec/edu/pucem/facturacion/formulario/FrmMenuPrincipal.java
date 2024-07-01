package ec.edu.pucem.facturacion.formulario;


import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ec.edu.pucem.facturacion.dominio.ListaCliente1;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import java.awt.CardLayout;

public class FrmMenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDesktopPane desktopPane;
    private FrmListaClientes1 frmlistacliente1;
    private ListaCliente1 listacliente1 = new ListaCliente1();
    private FrmCrearCliente frmcrearcliente;


	
	public FrmMenuPrincipal() {
		setTitle("Sistema de Facturacion Electronica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 501);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnArchivo);
		JMenuItem mntmSalir = new JMenuItem("Salir");
        mntmSalir.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/ec/edu/pucem/facturacion/imagen/exit.png")));
        mntmSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mntmSalir.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        mnArchivo.add(mntmSalir);
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnClientes);
		
		JMenuItem mntmCrearNuevo = new JMenuItem("Crear Nuevo");
        mntmCrearNuevo.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/ec/edu/pucem/facturacion/imagen/crear.png")));
        mntmCrearNuevo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if (frmcrearcliente == null || !frmcrearcliente.isVisible()) {
                    frmcrearcliente = new FrmCrearCliente(listacliente1);
                    desktopPane.add(frmcrearcliente);
                    frmcrearcliente.setVisible(true);
                } else {
                    frmcrearcliente.requestFocus();
                }
            }
        });

		mnClientes.add(mntmCrearNuevo);
		
		JMenuItem mntmListaClientes1 = new JMenuItem("Lista de Clientes");
        mntmListaClientes1.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/ec/edu/pucem/facturacion/imagen/lista.png")));
        mntmListaClientes1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                if (frmlistacliente1 == null || !frmlistacliente1.isVisible()) {
                    frmlistacliente1 = new FrmListaClientes1(listacliente1);
                    desktopPane.add(frmlistacliente1);
                    frmlistacliente1.setVisible(true);
                } else {
                    frmlistacliente1.requestFocus();
                }
            }
        });
        mnClientes.add(mntmListaClientes1);
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnProductos);
		
		JMenu mnRedes = new JMenu("Redes");
		mnRedes.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnRedes);
		
		JMenuItem mntmFacebook = new JMenuItem("Facebook");
		mntmFacebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmFacebook frmfacebook = new FrmFacebook();
				frmfacebook.setVisible(true);
				desktopPane.add(frmfacebook);
				
			}
		});
		mntmFacebook.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mntmFacebook.setIcon(new ImageIcon(FrmMenuPrincipal.class.getResource("/ec/edu/pucem/facturacion/imagen/facebook.png")));
		mnRedes.add(mntmFacebook);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, "name_7123010558300");
	}
}
