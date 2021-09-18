package com.atguigu.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/9/17  20:22
 */
@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    @Version
    private Integer version;
}
