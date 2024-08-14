package ch07.sec10.exam02;

public abstract class Animal {
// abstact 삭제
    // 메서드 선언
    public void breathe() {
        System.out.println("숨을 쉽니다");
    }


// 추상 메서드 선언
    public abstract void sound();
    // body 만들기.
    // class 에 abstact 추가
}