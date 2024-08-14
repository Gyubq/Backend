package ch04.sec02;public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90이상입니다 ");
            System.out.println("등급은A입니다");
        }
        if (score <90) {
            System.out.println("점수가 90미만입니다");
            System.out.println("등급은 B입니다");
        }
    }
}
