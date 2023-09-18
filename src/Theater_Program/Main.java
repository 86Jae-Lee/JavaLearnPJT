package Theater_Program;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 극장 생성
        Theater theater = new Theater("극장", 4, 4);
        Booking booking = new Booking(theater);

        // 사용자 생성
        booking.registerCustomer("손님1", "010-1111-2222");

        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("극장 예약 프로그램입니다.");
            System.out.println("1. 좌석 확인");
            System.out.println("2. 좌석 예약");
            System.out.println("3. 예약 확인");
            System.out.println("4. 프로그램 종료");
            System.out.print("선택 : ");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    // 좌석 확인
                    showAvailableSeats(theater);
                    break;
                case 2:
                    // 좌석 예약
                    makeReservation(booking, scanner);
                    break;
                case 3:
                    // 예약 확인
                    displayReservation(booking);
                    break;
                case 4:
                    // 프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }

        } while (num != 4);

    }

    //예약 가능 좌석 표시
    private static void showAvailableSeats(Theater theater) {
        System.out.println("\n예약 가능한 좌석 목록");
        List<Seat> availableSeats = theater.getAvailableSeats();
        for (Seat seat : availableSeats) {
            System.out.println(seat.toString());
        }
    }

    //좌석 예약
    private static void makeReservation(Booking booking, Scanner scanner) {
        System.out.print("사용자 이름 : ");
        String customerName = scanner.next();
        System.out.print("사용자 전화번호 : ");
        String phoneNum = scanner.next();

        Customer customer = new Customer(customerName, phoneNum);

        System.out.print("좌석 선택 : ");
        int row = scanner.nextInt();
        int seatNum = scanner.nextInt();
        Seat seat = new Seat(row, seatNum);
        boolean success = booking.createReservation(customer, seat);
        if (success) {
            System.out.println("좌석이 예약되었습니다.");
        } else {
            System.out.println("좌석 예약이 실패했습니다. 이미 예약된 좌석입니다.");
        }
    }

    // 예약 목록 표시
    private static void displayReservation(Booking booking) {
        List<Reservation> reservations = booking.getReservations();
        System.out.println("\n예약 목록 : ");
        for (Reservation reservation : reservations) {
            System.out.println(reservation.toString());
        }
    }

}
