package com.example.demo.controller;

import com.example.demo.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafController {
    @GetMapping("show")
    public String showView(Model model){
        // Member 생성
        Member member = new Member(1,"김철수");

        // 컬렉션 저장용 Member 생성
        Member member1 = new Member(10,"김영희");
        Member member2 = new Member(20,"이민수");

        // List 생성
        List<String> directions = new ArrayList<>();
        directions.add("동");
        directions.add("서");
        directions.add("남");
        directions.add("북");

        // Map을 생성해서 Member를 저장
        Map<String,Member> memberMap = new HashMap<>();
        memberMap.put("kim",member1);
        memberMap.put("lee",member2);


        // List를 생성해서 Member를 저장
        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);

        // Model에 데이터 추가
        model.addAttribute("name","이순신");
        model.addAttribute("member",member);
        model.addAttribute("directions",directions);
        model.addAttribute("memberMap",memberMap);
        model.addAttribute("memberList",memberList);

        // 반환값 이름으로 뷰 설정
        return "useThymeleaf";
    }

    @GetMapping("a")
    public String showA(){
        return "pageA";
    }
}
