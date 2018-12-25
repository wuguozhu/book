/*
 *  广州丰石科技有限公司拥有本软件版权2018并保留所有权利。
 *  Copyright 2018, Guangzhou Rich Stone Data Technologies Company Limited,
 *  All rights reserved.
 */

package com.anan.service.impl;

import com.anan.entity.Book;
import com.anan.mapper.BookMapper;
import com.anan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService{


    @Autowired
    private BookMapper bookMapper;




    @Override
    public Book getBookById(int id) {
        return  bookMapper.getBookById(id);
    }
}
