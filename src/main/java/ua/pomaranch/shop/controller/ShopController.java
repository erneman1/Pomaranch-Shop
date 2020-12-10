package ua.pomaranch.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pomaranch.shop.domain.ItemPair;

import ua.pomaranch.shop.service.ProductService;

@Controller
@RequestMapping("/shop")
@RequiredArgsConstructor
public class ShopController {

    private final ProductService service;

    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products", service.getAllProducts());
        return "shop";
    }

    @GetMapping("/details/{id}")
    public String getItem(@PathVariable long id, Model model){
        model.addAttribute("product", service.findById(id));
        ItemPair pair = new ItemPair();
        pair.setQuantity(1);
        model.addAttribute("item", pair);
        return "item";
    }
}
