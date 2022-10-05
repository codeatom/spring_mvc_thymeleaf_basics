package spring_mvc_thymeleaf_basics.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    List<String> contactList = new ArrayList<>();

    @GetMapping(value = {"", "/", "/index"})
    public String index(){
        return "home/index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "home/contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("email") String email) {
        contactList.add(email);
        return "home/contact";
    }

    @GetMapping("/contactList")
    public String contactList(Model model) {
        model.addAttribute("contactList", contactList);
        return "home/contactList";
    }

    @GetMapping("/about")
    public String about() {
        return "home/about";
    }

}
