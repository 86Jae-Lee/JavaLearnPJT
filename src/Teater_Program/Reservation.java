package Teater_Program;

import java.sql.Date;

public class Reservation {

    private int reservationID;
    private Customer customer;
    private Seat seat;
    private Date reservationDate;

    private Reservation (int reservationID, Customer customer, Seat seat, Date reservationDate) {
        this.reservationID = reservationID;
        this.customer = customer;
        this.seat = seat;
        this.reservationDate = reservationDate;
    }

    // 예약정보 가져오기
    public int getReservationID() {
        return reservationID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Seat getSeat() {
        return seat;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    // 예약정보 출력
    @Override
    public String toString() {
        return "예약정보 [예약번호 : " + reservationID + ", 고객 : " + customer.getCustomer() +
                ", 좌석 : " + seat.toString() + ", 예약일 : " + reservationDate + "]";
    }
}
