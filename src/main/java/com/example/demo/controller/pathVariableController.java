package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("path")
public class pathVariableController {
    /**
     * 화면 표시
     */

    @GetMapping("show")
    public String showView() {
        return "show";
    }

    @GetMapping("/function/{no}")
    public String selectFunction(@PathVariable Integer no) {
        // 뷰 이름을 초기화
        String view = "";

        switch (no) {
            case 1:
                view = "pathvariable/function1";
                break;
            case 2:
                view = "pathvariable/function2";
                break;
            case 3:
                view = "pathvariable/function3";
                break;
        }

        return view;
    }

    @PostMapping(value = "send", params = "a")
    public String showAView() {
        return "submit/a";
    }

    @PostMapping(value = "send", params = "b")
    public String showBView() {
        return "submit/b";
    }

    @PostMapping(value = "send", params = "c")
    public String showCView() {
        return "submit/c";
    }
}
