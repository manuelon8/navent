package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Pedidos;
import persistencia.BumexMemcached;

public class PedidosDAO {

	public void  insertOrUpdate(Pedidos pedido) {
	BumexMemcached.getInstance().set(String.valueOf(pedido.getIdPedido()), pedido);
	}
	public void delete(String pedido) {
		BumexMemcached.getInstance().delete(pedido);
	}
	public Pedidos select(String idPedido) {		
		return BumexMemcached.getInstance().get(idPedido);		 
	}
	
	public List<Pedidos>  getListadoPedidos(){
		return BumexMemcached.getInstance().getListadoPedidos();
	}
	
	

}
