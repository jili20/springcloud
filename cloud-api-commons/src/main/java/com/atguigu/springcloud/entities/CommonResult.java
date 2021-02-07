package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回结果 - json 封装体
 *
 * @author bing  @create 2021/2/2-下午8:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    // 两个参数
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}