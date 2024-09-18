package exceções;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExcessoesPersonalizadas {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int quarto = sc.nextInt();
        System.out.print("Data de Check-In (dd/MM/yyyy): ");
        Date CheckIn = sdf.parse(sc.next());
        System.out.print("Data de Check-Out (dd/MM/yyyy): ");
        Date CheckOut = sdf.parse(sc.next());

        if (!CheckOut.after(CheckIn)) {
            System.out.println("Erro ao reservar: data de CheckOut deve ser futura à de CheckIn");
        }
        else{
            Reservation reserva = new Reservation(quarto, CheckIn, CheckOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados para atualizar a reserva: ");
            System.out.print("Data de Check-In (dd/MM/yyyy): ");
            CheckIn = sdf.parse(sc.next());
            System.out.print("Data de Check-Out (dd/MM/yyyy): ");
            CheckOut = sdf.parse(sc.next());

            Date now = new Date();
            if (CheckIn.before(now) || CheckOut.before(now)) {
                System.out.println("Erro ao reservar: as datas de reserva atualizadas devem ser futuras às anteriores");
            }
            else if (!CheckOut.after(CheckIn)) {
                System.out.println("Erro ao reservar: as datas de reserva atualizadas devem ser futuras às anteriores");
            }
            else{
                reserva.updateDates(CheckIn, CheckOut);
                System.out.println("Reserva: " + reserva);
            }
        }
        sc.close();
    }
}
