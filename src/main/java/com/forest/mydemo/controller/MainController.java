package com.forest.mydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest
 * @date 2022/6/8 16:40
 */
@RestController
@RequestMapping("/my")
public class MainController {

    @GetMapping("/test")
    public String get () {
        return "Hello!!!";
    }
}
