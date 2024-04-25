package com.example.demo.chap03.used;

import org.springframework.stereotype.Component;

@Component
public class MorningGreet implements Greet{
    /**
     * Greet 구현 클래스
     * 아침 인사하기
     */

    @Override
    public void greeting(){
        System.out.println("=".repeat(20));
        System.out.println("좋은 아침입니다!");
        System.out.println("=".repeat(20));
    }
}
