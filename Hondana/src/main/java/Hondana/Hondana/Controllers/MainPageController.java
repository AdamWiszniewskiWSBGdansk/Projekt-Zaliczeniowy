package Hondana.Hondana.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainPageController {

    @GetMapping("/")
    public String mainPage(){
        return "mainPage";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "loginPage";
    }
}
