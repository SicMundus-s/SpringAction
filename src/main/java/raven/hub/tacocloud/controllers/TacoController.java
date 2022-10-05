package raven.hub.tacocloud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taco")
public class TacoController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}