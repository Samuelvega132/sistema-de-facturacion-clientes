package ec.edu.pucem.facturacion.dominio;

import java.util.ArrayList;
import java.util.List;

public class ListaCliente1 {
    private List<Cliente> datosClientes;

    public ListaCliente1() {
        this.datosClientes = new ArrayList<>();
    }

    public List<Cliente> getListaClientes() {
        return datosClientes;
    }
    

    public void agregarCliente(Cliente cliente) {
        datosClientes.add(cliente);
    }

	

}