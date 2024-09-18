package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkIn = checkin;
        this.checkOut = checkout;
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

    public void updateDates(Date checkin, Date checkout) {
        this.checkIn = checkin;
        this.checkOut = checkout;
    }

    @Override
    public String toString() {
        return "Quarto " + roomNumber + ", checkin: "  + sdf.format(checkIn) + " , checkout: " + sdf.format(checkOut) + ", " + duration() + " noites";
    }
}
