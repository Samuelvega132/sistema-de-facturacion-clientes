package ec.edu.pucem.facturacion.formulario;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ec.edu.pucem.facturacion.dominio.Cliente;
import ec.edu.pucem.facturacion.dominio.ListaCliente1;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class FrmListaClientes1 extends JInternalFrame {
    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private ListaCliente1 listaCliente1;
	private boolean Duplicado = false; 


    public FrmListaClientes1(ListaCliente1 listaCliente1) {
        this.listaCliente1 = listaCliente1;

        setTitle("Lista de Clientes");
        setBounds(100, 100, 600, 400);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        Duplicado = false;

        table = new JTable();
        model = new DefaultTableModel(
            new Object[][] {},
            new String[] { "Cédula", "Nombre", "Dirección", "Celular" }
        );
        table.setModel(model);
        scrollPane.setViewportView(table);

        cargarDatosClientes();
    }

    private void cargarDatosClientes() {
        model.setRowCount(0);
        List<Cliente> clientes = listaCliente1.getListaClientes();
        for (Cliente cliente : clientes) {
            model.addRow(new Object[] {
                cliente.getCedula(), 
                cliente.getNombres(), 
                cliente.getDireccion(), 
                cliente.getCelular()
            });
        }
    }
}
