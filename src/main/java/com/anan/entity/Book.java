package com.anan.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Book {

    /**
     * 图书ID.
     */
    @Id
    private Integer id;

    /**
     * 图书名字.
     */
    private String name;

    /**
     * 图书数量
     */
    private Integer number;

    /**
     * 图书价格.
     */
    private Integer price;

    /**
     * 出版社.
     */
    private String printshop;


}
