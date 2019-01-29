package com.anan.entity;

import lombok.Data;

@Data
public class Book {

    /**
     * 图书ID.
     */
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
