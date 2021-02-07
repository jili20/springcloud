package com.atguigu.springcloud.alibaba.service;

/**
 * @author bing  @create 2021/2/6-下午5:03
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

