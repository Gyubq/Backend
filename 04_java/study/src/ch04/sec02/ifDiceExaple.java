package ch04.sec02;

public class ifDiceExaple {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6+1); //주사위 번호뽑기
        
        if(num==1) {
            System.out.println("1번입니다");
        }
        else if(num==2) {
            System.out.println("2번입니다");
        }
        else if(num==3) {
            System.out.println("3번입니다");
        }
        else if(num==4) {
            System.out.println("4번입니다");
        }
        else if(num==5) {
            System.out.println("5번입니다");
        }
        else {
            System.out.println("6번입니다");
        }
    }
}
