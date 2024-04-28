package com.example.demo.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class RequestParamController {
    /**
     * 입력 화면을 표시
     */
    @GetMapping("entry")
    public String showView() {
        // 반환값으로 이름 돌려줌
        return "entry";
    }

    @PostMapping("confirm")
    public String confirmView(Model model, @RequestParam String name, @RequestParam Integer age, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth) {
        // Model에 저장
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("birth", birth);

        return "confirm";
    }
}
