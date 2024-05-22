package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		/*for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}*/
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r1 = " + r3);
		System.out.println("r2 = " + r4);
		
		System.out.println("do4 dia = " + d04.getDayOfMonth());
		System.out.println("do4 mes = " + d04.getMonthValue());
		System.out.println("do4 ano = " + d04.getYear());

		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 minutos = " + d05.getMinute());
		
	}

}
