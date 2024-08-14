package jungol;

import java.util.Scanner;

public class gugu_1291 {

    public static void main(String[] args) {

        // 사용자의 입력받기.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        // s,e 의 범위지정
        if (s < 2 || s > 9 || e < 2 || e > 9) {
            System.out.println("시작과 끝은 2~9 사이에정수만가능하다.");
            return;
        }


            if (s < e) { // s < e 일때의 증감 식
                for (int i = s; i <= e; i++) {
                    // 두가지경우의 수의나온결과를 printgu(i) 에 저장
                    // printgu void 생성
                    printgu(i);
                    System.out.println();
                }
            }

            else {
              // s > e 일때의 증감 식 // 9 ~ 6 일떄 --인데 조건을 어떻게해줘야하노
                        // 감소되면서 e와 가까워지니까 i >= e 반대로.
            for (int i = s; i >= e ; i--) {
                printgu(i);
                System.out.println();
            }
        }

    }

    // i 반복문에서나온 printgu + 1~9 출력하는 구구단 합치기. how?
    // i => dan i로 해도되는데 가독성을위해 변경

    // 본문을보고 빈칸 어디에넣어야 하는지 봐야하는데 어렵네
    private static void printgu(int dan) {
        for (int j = 1; j <= 9; j++) {
            System.out.print(dan + "*" + j + "=" + (dan * j) );
        }
    }
}

/*
 gpt 정답 .  if else 가정을 나누지말고 if일때 전체 , else일때 전체를 해서 출력함

package jungol;

import java.util.Scanner;

public class gugu_1291 {

    public static void main(String[] args) {

        // 사용자의 입력받기
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        // s, e 의 범위 지정
        if (s < 2 || s > 9 || e < 2 || e > 9) {
            System.out.println("시작과 끝은 2~9 사이에 정수만 가능합니다.");
            return;
        }

        if (s <= e) { // s <= e 일 때
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j <= e; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        } else { // s > e 일 때
            for (int i = 1; i <= 9; i++) {
                for (int j = s; j >= e; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        }
    }
}

=>  두단을 동시에 출력하는 매서드만드는법.
BUT 매서드 만드는것보다 맨위에것 처럼 하는것이 더좋다.
package jungol;

import java.util.Scanner;

public class gugu_1291 {

    public static void main(String[] args) {

        // 사용자의 입력받기
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        // s, e 의 범위 지정
        if (s < 2 || s > 9 || e < 2 || e > 9) {
            System.out.println("시작과 끝은 2~9 사이에 정수만 가능합니다.");
            return;
        }

        if (s <= e) { // s <= e 일 때
            for (int i = s; i <= e; i++) {
                if (i < e) {
                    printgu(i, i + 1); // 두 개의 단을 동시에 출력
                } else {
                    printgu(i, -1); // 마지막 단은 단독 출력
                }
                System.out.println();
            }
        } else { // s > e 일 때
            for (int i = s; i >= e; i--) {
                if (i > e) {
                    printgu(i, i - 1); // 두 개의 단을 동시에 출력
                } else {
                    printgu(i, -1); // 마지막 단은 단독 출력
                }
                System.out.println();
            }
        }
    }

    // 두 개의 단을 동시에 출력하는 메서드
    private static void printgu(int dan1, int dan2) {
        for (int j = 1; j <= 9; j++) {
            if (dan2 != -1) { // 두 단이 모두 있을 때
                System.out.printf("%d * %d = %2d   %d * %d = %2d   ", dan1, j, dan1 * j, dan2, j, dan2 * j);
            } else { // 단일 단만 출력할 때
                System.out.printf("%d * %d = %2d   ", dan1, j, dan1 * j);
            }
            System.out.println(); // 각 줄 끝에 줄바꿈 추가
        }
    }
}

 */
