package modelo;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Pedidos {
	
	private int idPedido;
	@Size(max = 100, min = 3, message = "Ingrese un nombre correcto")
	@NotNull(message = "El campo nombre no puede estar vacio")
	private String nombre;
	@NotNull(message = "El monto nombre no puede estar vacio")
	private BigDecimal monto;
	private BigDecimal descuento;
	public Pedidos(int idPedido, String nombre, BigDecimal monto, BigDecimal descuento) {
		super();
		this.idPedido = idPedido;
		this.nombre = nombre;
		this.monto = monto;
		this.descuento = descuento;
	}
  Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public BigDecimal getDescuento() {
		return descuento;
	}
	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}
	
	
	
	
}