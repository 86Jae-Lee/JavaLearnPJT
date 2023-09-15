package Teater_Program;

public class Seat {
    private int row;
    private int seatNum;
    private boolean reserved;

    public Seat(int row, int seatNum) {
        this.row = row;
        this.seatNum = seatNum;
        this.reserved = false;
    }
    // 좌석 예약
    public void reserve() {
        reserved = true;
    }

    // 좌석 예약 취소
    public void cancelReservation() {
        reserved = false;
    }

    // 좌석 예약 확인
    public boolean isReserved() {
        return reserved;
    }

    // 좌석 정보 출력
    @Override
    public String toString() {
        return "좌석 [열 : " + row + ", 번호 : " + seatNum + "]";
    }


}
