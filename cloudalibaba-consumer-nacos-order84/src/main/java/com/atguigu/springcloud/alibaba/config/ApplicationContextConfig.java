package com.atguigu.springcloud.alibaba.config;


/** 使用 ribbon 负载均衡
 * @author bing  @create 2021/2/5-上午11:49
 */
@Configuration
public class ApplicationContextConfig
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
