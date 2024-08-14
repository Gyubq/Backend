package ch04.sec02;

public class ifNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20+81);
        System.out.println("점수 :  "+ score);

        if(score >=95) {
            System.out.println("A+");
        }
        else if(score >=90) {
            System.out.println("A");
        }
        else if(score >=85) {
            System.out.println("B+");
        }
        else{
            System.out.println("B");
        }
    }
}
