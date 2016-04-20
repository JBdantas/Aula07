package model;

import to.ListaDeClientes;
import dao.VendedorDAO;

public class Vendedor {
	public ListaDeClientes listarClientes(){
		ListaDeClientes lista;
		VendedorDAO dao = new VendedorDAO();
		lista = dao.listarClientes();
		return lista;
	}
	public ListaDeClientes listarClientes(String chave){
		ListaDeClientes lista;
		VendedorDAO dao = new VendedorDAO();
		lista = dao.listarClientes(chave);
		return lista;
	}

}
