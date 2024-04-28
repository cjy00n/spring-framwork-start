package com.example.demo.controller;

import com.example.demo.form.CalcForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("validate")
public class ValidationController {
    /**
     * from-backing bean 초기화
     */
    @ModelAttribute
    public CalcForm setUpForm() {
        return new CalcForm();
    }

    /**
     * 입력 화면 표시
     */
    @GetMapping("show")
    public String showView() {
        return "calcEntry";
    }

    @PostMapping("calc")
    public String confirmViww(@Validated CalcForm form, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            // 입력 화면으로
            return "calcEntry";
        }

        Integer result = form.getLeftNum() + form.getRightNum();
        model.addAttribute("result", result);

        return "calcConfirm";
    }

}
