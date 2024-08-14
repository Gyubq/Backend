package ch09.sec2.exam02;

public class A {
    // 인스턴스 멤버 클래스

    class B {
        // 인스턴스 필드
        int field1 = 1;

        // 정적필드
        static int field2 = 2;

        // 생성자


        public B() {
            System.out.println("B- 생성자 실행 ");

        }

        // 인스턴스 메서드

        void method1() {
            System.out.println("B-method1 실행");
        }

        // 정적 메서드
        static void method2() {
            System.out.println("B-method2 실행 ");
        }
    }

    // 인스턴스 메서드
    void useB() {
        // 객체 생성 및 인스턴스 필드 생성

        B b = new B();
        System.out.println(b.field1);
        b.method1();

        System.out.println(B.field2);
        B.method2();


    }
}
