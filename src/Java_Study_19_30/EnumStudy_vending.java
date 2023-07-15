package Java_Study_19_30;

public class EnumStudy_vending {

    public static void main(String[] args) {


    }
}

enum memberStatus {
    READY, LOGIN, LOGOUT
}

class Member {
    memberStatus status;

    Member() {

    }

    public void setStatus(memberStatus status){
        this.status = status;
    }

    public void getStatus() {
        if(this.status == memberStatus.READY) {
            System.out.print("이 회원은 준비가 된 상태입니다.");
        } else if (this.status == memberStatus.LOGIN) {
            System.out.print("이 회원은 이미 로그인이 된 상태입니다.");
        } else if (this.status == memberStatus.LOGOUT) {
            System.out.print("이 회원은 이미 로그아웃이 된 상태입니다.");
        }
    }
}