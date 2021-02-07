package com.atguigu.springcloud.entities;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

        import java.io.Serializable;

/**
 * @author bing  @create 2021/2/2-下午8:32
 */
@Data
@AllArgsConstructor // 全参构造器
@NoArgsConstructor // 空参构造器
public class Payment implements Serializable
{
    private Long id;
    private String serial;
}