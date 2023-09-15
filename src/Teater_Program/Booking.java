package Teater_Program;

import java.util.ArrayList;
import java.util.List;

public class Booking {

    private Theater theater;
    private List<Customer> customers;
    private List<Reservation> reservations;
    private int reservationNum;

    public Booking(Theater theater) {
        this.theater = theater;
        this.customers = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.reservationNum = 1;
    }
}
