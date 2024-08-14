package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
    int score =20;

    if(score >=90) {
        System.out.println("점수가 100~90입니다");
        System.out.println("등급은 A입니다 ");
    } else if (score>=80) {
        System.out.println("점수가 80~89입니다");
        System.out.println("등급은B입니다");
    } else if (score>=70) {
        System.out.println("점수가 70~79입니다");
        System.out.println("등급은 C입니다");
    }
     else {
        System.out.println("점수가 70 미만입니다");
        System.out.println("등급은'국가권력급'입니다");
    }
    }
}
