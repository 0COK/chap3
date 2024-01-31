package com.quest.chap04;

import java.util.Scanner;

public class D01 {
    public void test02() {

        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 이름을 알려주세요 : ");
        String name = sc.nextLine();
        System.out.println("당신의 몸무게를 입력해주세요 : ");
        int weight = sc.nextInt();

        String grade = "";

        if (weight > 30) {

            grade += "당신은 비만입니다";

            if (weight < 29){
            }
        }

    }
}
