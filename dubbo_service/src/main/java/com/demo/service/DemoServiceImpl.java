package com.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.api.DemoService;
import org.springframework.stereotype.Component;

/**
 * Demo接口的实现
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {

    /**
     * 根据商品编号获取商品信息
     * @param productId
     * @return
     */
    @Override
    public String getProductById(Integer productId) {
        if (productId == null) {
            throw new RuntimeException("the productId can not be Empty！");
        }
        return productId + "号商品信息：{名称：java ,价格：100，描述：是一门面向对象编程语言}";
    }
}
