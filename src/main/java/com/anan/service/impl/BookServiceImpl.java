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
    public Book getBookById(Integer id) {
        return  bookMapper.getBookById(id);
    }
}
