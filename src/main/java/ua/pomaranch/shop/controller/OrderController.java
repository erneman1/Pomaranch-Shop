package ua.pomaranch.shop.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pomaranch.shop.domain.ItemPair;
import ua.pomaranch.shop.domain.Order;
import ua.pomaranch.shop.domain.OrderItem;
import ua.pomaranch.shop.service.OrderService;
import ua.pomaranch.shop.service.ProductService;

import javax.servlet.http.HttpSession;

import static ua.pomaranch.shop.util.Const.SESSION_ATTR;

@Controller
@RequiredArgsConstructor
@RequestMapping("/order")
@Slf4j
public class OrderController {

    private final ProductService productService;
    private final OrderService orderService;

    @GetMapping("/cart")
    public String cart(Model model, HttpSession session) {
        Order order = (Order) session.getAttribute(SESSION_ATTR);
        model.addAttribute("orderList", order.getOrderItems());
        return "cart";
    }

    @PostMapping("/add")
    public String addToOrder(HttpSession session, @ModelAttribute ItemPair itemPair){
        Order order = (Order) session.getAttribute("order");
        order.addToOrderList(new OrderItem(itemPair.getQuantity(), productService.findById(itemPair.getProductId()), order));
        return "redirect:/shop";
    }

    @PostMapping("/checkout")
    public String purchase(HttpSession session){
        Order order = (Order) session.getAttribute(SESSION_ATTR);
        orderService.addOrder(order);
        session.removeAttribute("order");
        return "redirect:/";
    }
}
