package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** 远程调用 - 库存：接口加注解
 * @author bing  @create 2021/2/6-下午2:21
 */
@FeignClient(value = "seata-storage-service") //去找这个微服务
public interface StorageService
{
    @PostMapping(value = "/storage/decrease")  // 做减法 // 创建订单，去找 库存微服务 --> /storage/decrease 方法
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}

