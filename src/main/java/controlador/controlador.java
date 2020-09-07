package controlador;

import java.math.BigDecimal;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import dao.PedidosDAO;
import modelo.Pedidos;

@Path("/pedidos")
public class controlador {
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String getItb() {
	      return "Got it from controlador b16!";
	  }
	PedidosDAO dao=new PedidosDAO();
	
	@GET
	@Path("{listar}")
	@Produces(MediaType.APPLICATION_JSON + "; charset=ISO-8859-1")
	public List<Pedidos>  getListadoPedidos(){
		return dao.getListadoPedidos();
	}
//  
//  @GET
//  @Path("{a}")
//  @Produces(MediaType.TEXT_PLAIN)
//  public String getIt() {
//      return "Got it from controlador 2!";
//  }
  
//	@GET
//	@Path("{select}") 
//	@Produces(MediaType.APPLICATION_JSON + "; charset=ISO-8859-1")
//	public Pedidos select(@QueryParam("id") String   idPedido) {		 
//		return dao.select(idPedido);
//	}
  
   
//  
//	
	
	@POST
	@Path("{agregar}")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN + "; charset=ISO-8859-1")
	public void insertOrUpdate(
			@DefaultValue("nulo")
			@FormParam("idPedido")
			String idPedido,
			@DefaultValue("")
			@FormParam("nombre")
			String nombre,
			@DefaultValue("0.0")
			@FormParam("monto")
			BigDecimal monto,
			@DefaultValue("0.0")
			@FormParam("descuento")
			BigDecimal descuento
			){
		System.out.println("Insertar Articulo");
		if(idPedido.equals("nulo")) {
			System.out.println( "Clave no especificada");}
		if(monto.floatValue() == 0f) {
			System.out.println("monto no especificado o igual a cero");
		}
		Pedidos p = new Pedidos(Integer.parseInt(idPedido),nombre, monto, descuento);
		dao.insertOrUpdate(p);
	}
//	
//	
//	@DELETE
//	@Path("{idpe}")	 
//	public void delete(@QueryParam("idpe")
//	String  id) {
//		dao.delete(id);
//	}
	

	


}
