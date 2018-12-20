package com.anan.service;

import com.anan.entity.Book;
import com.anan.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    @Autowired
    private BookMapper bookMapper;


    public Book getBookById(int id){
        return  bookMapper.getBookById(id);
    }


}
