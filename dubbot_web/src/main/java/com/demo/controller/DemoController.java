package com.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo控制器
 */
@RestController
@RequestMapping("/Demo/")
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("findById/{productId}")
    public String findById(@PathVariable Integer productId){
        return this.demoService.getProductById(productId);
    }

}
