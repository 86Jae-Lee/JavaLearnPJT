package Theater_Program;

import java.util.*;

public class Theater {

    private String name;
    private int numRow;
    private int numSeatRow;
    private Seat[][] seats;

    public Theater(String name, int numRow, int numSeatRow) {
        this.name = name;
        this.numRow = numRow;
        this.numSeatRow = numSeatRow;
        this.seats = new Seat[numRow][numSeatRow];
        initializeSeats();
    }

    // 좌석 초기화
    private void initializeSeats() {
        for(int row = 0 ; row < numRow ; row++) {
            for(int seatNum = 0 ; seatNum < numSeatRow ; seatNum++) {
                seats[row][seatNum] = new Seat(row, seatNum);
            }
        }
    }

    // 예약 가능한 좌석 목록 반환
    public List<Seat> getAvailableSeat() {
        List<Seat> availableSeat = new ArrayList<>();
        for (int row = 0 ; row < numRow ; row++) {
            for (int seatNum = 0; seatNum < numSeatRow ; seatNum++){
                Seat seat = seats[row][seatNum];
                if(!seat.isReserved()) {
                    availableSeat.add(seat);
                }
            }
        }
        return availableSeat;
    }

    // 좌석 예약
    public boolean reserveSeat(int row, int seatNum) {
        if (row >= 0 && row < numRow && seatNum >= 0 && seatNum < numSeatRow) {
            Seat seat = seats[row][seatNum];
            if (!seat.isReserved()) {
                seat.reserve();
            }
        }
        return true;
    }

    // 극장 이름 반환
    public String getName() {
        return name;
    }
}
