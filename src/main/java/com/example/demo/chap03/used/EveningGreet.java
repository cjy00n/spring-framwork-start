package com.example.demo.chap03.used;

import org.springframework.stereotype.Component;

//@Component
public class EveningGreet implements Greet{
    /**
     * Greet 구현 클래스
     * 저녁 인사하기
     */

    @Override
    public void greeting() {
        System.out.println("=".repeat(20));
        System.out.println("좋은 저녁입니다!");
        System.out.println("=".repeat(20));
    }
}
