package com.atguigu.mybatis_plus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @Author Ninomiya_Mioto
 * Date on 2021/9/17  9:57
 */
@Data
public class User {
    @TableId(type = IdType.AUTO)//写不写都行，默认就是雪花
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableField(fill= FieldFill.INSERT)
    private Date createTime;

    @TableField(fill= FieldFill.UPDATE)
    private Date updateTime;
}
