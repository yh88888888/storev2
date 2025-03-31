package com.metacoding.storev2.order;


import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order/save")
    public String order(@RequestParam("storeId") int storeId,
                        @RequestParam("userId") int userId,
                        @RequestParam("qty") int qty) {
        orderService.구매하기(storeId, userId, qty);
        return "redirect:/log";
    }

    @GetMapping("/log")
    public String log() {
        return "/log/list";
    }
}
