package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {

        int r =10;
        // new 생성자 단축기있지않음?
        Calculator calculator = new Calculator();
        System.out.println(" 원 면적 칼 : " + calculator.areaCircle(r));
        System.out.println();


        Computer computer = new Computer ();
        System.out.println("원면적 컴 : " + computer.areaCircle(r));
    }

}
