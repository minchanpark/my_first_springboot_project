package com.thc.fallsprbasic.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class DefaultController {
     //이 안에 있는 주소값은 꼭 유니크해야함!!
    @GetMapping("/index")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Thymeleaf!");
        return "index"; // "index.html" 템플릿을 렌더링
    }
}
