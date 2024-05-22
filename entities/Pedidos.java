package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Pedidos {
	
	private Integer id;
	private Date momento;
	private OrderStatus status;
	
	public Pedidos() {
	}

	public Pedidos(Integer id, Date momento, OrderStatus status) {
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String toString() {
		return "Pedidos [id=" + id + ", momento=" + momento + ", status=" + status + "]";
	}
}
