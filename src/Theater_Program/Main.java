package Theater_Program;

public class Main {

    public static void main(String[] args) {

        // 극장 생성
        Theater theater = new Theater("극장", 10, 10);
        Booking booking = new Booking(theater);

        // 사용자 생성
        booking.registerCustomer("손님1", "010-1111-2222");
        booking.registerCustomer("손님2", "010-3333-4444");
        booking.registerCustomer("손님3", "010-5555-6666");

        
    }
}
