package com.anan.controller;


import com.anan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {


    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getBookById/{id}")
    public String getBook(@PathVariable int id) {
        return bookService.getBookById(id).toString();

    }
}
