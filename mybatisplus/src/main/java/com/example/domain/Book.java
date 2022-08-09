package com.example.domain;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author wch
 * @date 2022/8/6 10:40
 * @description
 */
@Data
public class Book {
    private Long id;
    private String type;
    private String name;
    private String description;
    private Integer deleted;
    @Version
    private Integer version;
}
