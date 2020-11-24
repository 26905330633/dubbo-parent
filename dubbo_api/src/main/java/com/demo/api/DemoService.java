package com.demo.api;

/**
 * Demo接口
 */
public interface DemoService {

    /**
     * 根据商品编号获取商品信息
     * @param productId
     * @return
     */
    String getProductById(Integer productId);

}
