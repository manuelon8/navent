package persistencia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import modelo.Pedidos;

 
 

public class BumexMemcached {
	
	private static BumexMemcached singletonInstance=new BumexMemcached();
	
	
	
	private BumexMemcached() {
		 
	}
	
	public static BumexMemcached getInstance() {
		return singletonInstance;
	}

	static Map<String, Pedidos> repositorio = cargarPedidos(); 
	
	 
	
	
	private static Map<String, Pedidos> cargarPedidos() {
		Map<String, Pedidos> pedido = new TreeMap<>();
		pedido.put("C-102C", new Pedidos(11, "200122", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102E", new Pedidos(1,"200123", new BigDecimal("2790"), new BigDecimal("790")));

		pedido.put("C-102F", new Pedidos(2,"200124", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102G", new Pedidos(3,"200125", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102H", new Pedidos(4,"200126", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102I", new Pedidos(5,"200127", new BigDecimal("2790"), new BigDecimal("2790")));
		pedido.put("C-102D", new Pedidos(6,"200128", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102W", new Pedidos(7,"200129", new BigDecimal("2790"), new BigDecimal("790")));
		pedido.put("C-102Q", new Pedidos(8,"200130", new BigDecimal("2790"), new BigDecimal("790")));
		return pedido;
	}
	
public void set(String key, Pedidos value) {
	repositorio.put(key, value);
	}
	

	public Pedidos get(String key) {
		return repositorio.get(key);
	}
	
	
	public void delete(String key) {
		repositorio.remove(key);
	}
	
	public List<Pedidos>  getListadoPedidos(){
		return new ArrayList<Pedidos>(repositorio.values());
	}
	
 
}
