package ch09.sec2.exam01;

public class A {
    // 인스턴스 멤버 클래스
    class B {

    }


    // 인스턴스 필드 값으로 B객체 대입.
    B field = new B();

    // 생성자
    A() {
        B b = new B();
    }

    // 인스턴스 매서드
    void method() {
        B b = new B();
    }
}

// 밖에다 사용하면 오류난다 . why , A클래스 내의 B가 있기때문.
//   B field = new B();




