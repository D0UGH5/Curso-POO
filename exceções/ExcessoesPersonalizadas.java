package exceções;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExcessoesPersonalizadas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int quarto = sc.nextInt();
            System.out.print("Data de Check-In (dd/MM/yyyy): ");
            Date CheckIn = sdf.parse(sc.next());
            System.out.print("Data de Check-Out (dd/MM/yyyy): ");
            Date CheckOut = sdf.parse(sc.next());

            Reservation reserva = new Reservation(quarto, CheckIn, CheckOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva: ");
            System.out.print("Data de Check-In (dd/MM/yyyy): ");
            CheckIn = sdf.parse(sc.next());
            System.out.print("Data de Check-Out (dd/MM/yyyy): ");
            CheckOut = sdf.parse(sc.next());

            reserva.updateDates(CheckIn, CheckOut);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        sc.close();
    }
}
