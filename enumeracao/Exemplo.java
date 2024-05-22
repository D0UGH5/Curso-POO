package enumeracao;

import java.util.Date;

import entities.Pedidos;
import entities.enums.OrderStatus;

public class Exemplo {

	public static void main(String[] args) {
		
		Pedidos pedido1 = new Pedidos(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido1);

	}

}
