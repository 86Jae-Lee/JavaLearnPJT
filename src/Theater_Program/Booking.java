package Theater_Program;

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

    // 사용자 등록
    public void registerCustomer(String customerName, String phoneNum) {
        Customer customer = new Customer(customerName, phoneNum);
        customers.add(customer);
    }

    //예약
    public boolean createReservation(Customer customer, Seat seat) {
        if (customer != null && seat != null && !seat.isReserved()) {
            int reservationID = reservationNum++;
            Reservation reservation = new Reservation(reservationID, customer, seat);
            reservations.add(reservation);
            seat.reserve();
            return true;
        }
        return false;
    }

    // 예약 목록 가져오기
    public List<Reservation> getReservations() {
        return reservations;
    }

    public Theater getTheater() {
        return theater;
    }

}
