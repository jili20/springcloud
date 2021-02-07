package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author bing  @create 2021/2/6-下午4:59
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}