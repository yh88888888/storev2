package com.metacoding.storev2.store;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class StoreController {
    private final StoreService storeService;
    private final HttpServletRequest request;

    @GetMapping("/productList")
    public String productList() {
        List<Store> productList = storeService.상품목록();
        request.setAttribute("productList", productList);
        return "store/list";
    }
    @GetMapping("/productDetail/{id}")
    public String productDetail(@PathVariable("id") int id) {
        Store productDetail = storeService.물건상세(id);
        System.out.println(productDetail);
        request.setAttribute("productDetail", productDetail);
        return "store/detail";}



}
