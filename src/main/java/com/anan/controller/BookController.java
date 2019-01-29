package com.anan.controller;


import com.anan.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(value = "/getBookById/{id}")
    public String getBookById(@PathVariable Integer id) {
        return bookService.getBookById(id).toString();

    }
}
