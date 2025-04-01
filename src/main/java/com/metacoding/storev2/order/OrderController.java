package com.metacoding.storev2.order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order/save")
    public String order(OrderRequest.LogDTO logDto) {
        System.out.println(logDto.getStoreId());
        System.out.println(logDto.getUserId());
        System.out.println(logDto.getQty());
        orderService.구매하기(logDto.getStoreId(), logDto.getUserId(), logDto.getQty());
        return "redirect:/log";
    }

    @GetMapping("/log")
    public String log() {
        return "/log/list";
    }
}
