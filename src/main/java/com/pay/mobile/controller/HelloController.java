package com.pay.mobile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: mobile-pay
 * @BelongsPackage: com.pay.mobile.controller
 * @Author: ZhenShanXu
 * @CreateTime: 2020-09-16 15:50.
 * @Description:
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/show")
    public String show(){
        return "hello spring";
    }

}
