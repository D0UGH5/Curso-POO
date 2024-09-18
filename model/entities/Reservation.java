package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date CheckIn, Date CheckOut){
        if (!CheckOut.after(CheckIn)) {
            throw new DomainException ("As datas de reserva atualizadas devem ser futuras às anteriores");
        }

        this.roomNumber = roomNumber;
        this.checkIn = CheckIn;
        this.checkOut = CheckOut;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); // diferença das datas em milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte milissegundos para dias
    }

    public String updateDates(Date CheckIn, Date CheckOut){

        Date now = new Date();
        if (CheckIn.before(now) || CheckOut.before(now)) {
            throw new DomainException("As datas de reserva atualizadas devem ser futuras às anteriores");
        }
        if (!CheckOut.after(CheckIn)) {
            throw new DomainException ("As datas de reserva atualizadas devem ser futuras às anteriores");
        }

        this.checkIn = CheckIn;
        this.checkOut = CheckOut;
        return null;
    }

    @Override
    public String toString() {
        return "Quarto " + roomNumber + ", checkin: "  + sdf.format(checkIn) + " , checkout: " + sdf.format(checkOut) + ", " + duration() + " noites";
    }
}
