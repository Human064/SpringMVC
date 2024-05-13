package com.human.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class myController {
    @RequestMapping("/")
    public String showFirstView() {
        return "firstView";
    }

    @RequestMapping("/askUser")
    public String askUserDetails() {
        return "askUser";
    }

    @GetMapping("/showUser/{user}")
    public String showUserDetails(@PathVariable("user") String user, Model model) {
        String nameAttribute = "Mr. " + user;

        model.addAttribute("nameAttribute", nameAttribute);

        return "showUser";
    }
}
