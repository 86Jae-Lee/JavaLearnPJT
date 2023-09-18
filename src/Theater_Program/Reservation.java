package Theater_Program;

public class Reservation {

    private int reservationID;
    private Customer customer;
    private Seat seat;

    public Reservation(int reservationID, Customer customer, Seat seat) {
        this.reservationID = reservationID;
        this.customer = customer;
        this.seat = seat;
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


    // 예약정보 출력
    @Override
    public String toString() {
        return "예약정보 [예약번호 : " + reservationID + ", 고객 : " + customer.getCustomer() +
                ", 좌석 : " + seat.toString() + "]";
    }
}
