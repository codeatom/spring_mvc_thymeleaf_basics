package spring_mvc_thymeleaf_basics.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_mvc_thymeleaf_basics.application.data.servivce.TemperatureService;


@Controller
public class FeverController {

    @GetMapping("/feverCheck")
    public String feverCheck() {
        return "doctor/feverCheck";
    }

    @PostMapping("/feverCheck")
    public String feverCheck(@RequestParam("temperature") String temperature, Model model) {

        if(temperature!=null || !temperature.trim().isEmpty())
        {
            model.addAttribute("bodyTemp", TemperatureService.TemperatureStatus(temperature));
        }

        return "doctor/feverCheck";
    }
}
