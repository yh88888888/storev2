package com.metacoding.storev2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewCheckController {

    @GetMapping("/t1")
    public String t1() {
        return "home";
    }

    @GetMapping("/t2")
    public String t2() {
        return "user/join-form";
    }

    @GetMapping("/t3")
    public String t3() {
        return "user/login-form";
    }

    @GetMapping("/t4")
    public String t4() {
        return "store/list";
    }

    @GetMapping("/t5")
    public String t5() {
        return "store/detail";
    }

    @GetMapping("/t6")
    public String t6() {
        return "store/save-form";
    }

    @GetMapping("/t7")
    public String t7() {
        return "store/update-form";
    }

    @GetMapping("/t8")
    public String t8() {
        return "order/list";
    }

}
