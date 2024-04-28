package com.example.demo.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Form {
    private String name;
    private Integer age;
    private LocalDate birth;
}
