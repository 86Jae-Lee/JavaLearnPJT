package Java_19_30_Time;



public class Enum_Study {

    public enum Status {
        /** 대기 */ WT("wait", 0),
        /** 완료 */ DN("done", 1),
        /** 실패 */ FL("fail", -1);

        private String status;
        private int code;
        private Status(String status, int code){
            this.status = status;
            this.code = code;

        }

    }
}
