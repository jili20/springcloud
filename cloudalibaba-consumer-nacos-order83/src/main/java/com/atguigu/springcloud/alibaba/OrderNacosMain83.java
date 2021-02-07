package com.atguigu.springcloud.alibaba;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author bing  @create 2021/2/2-下午9:11
 */
@EnableDiscoveryClient // 开启服务注册与发现
@SpringBootApplication
public class OrderNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class, args);
    }
}