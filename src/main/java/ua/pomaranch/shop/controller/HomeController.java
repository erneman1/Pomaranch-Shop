package ua.pomaranch.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.pomaranch.shop.domain.Order;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(HttpSession session){
        if (session.getAttribute("order") == null){
            session.setAttribute("order", new Order());
        }
        return "index";
    }
}
