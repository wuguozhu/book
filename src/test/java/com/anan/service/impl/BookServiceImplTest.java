package com.anan.service.impl;

import com.anan.BookApplication;
import com.anan.entity.Book;
import com.anan.service.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookApplication.class)
public class BookServiceImplTest {


    @Autowired
    private BookService bookService;

    @Test
    public void getBookById() {
        Book book = bookService.getBookById(11);
        System.out.println(book.toString());
    }

    @Test
    public void saveBook() {
        Book book = new Book();
        book.setId(4);
        book.setName("重构-改善既有代码的设计1");
        book.setNumber(101);
        book.setPrice(69);
        book.setPrintshop("人民邮电出版社");

        int i = bookService.saveBook(book);
        Assert.assertFalse(i < 0);
        Assert.assertEquals("返回错误", 1, i);
    }

    @Test
    public void deleteBookById() {
        int result = bookService.deleteBookById(4);
        Assert.assertFalse(result < 0);
        Assert.assertEquals("返回错误", 0, result);
    }

    @Test
    public void updateBook() {
        Book book = new Book();
        book.setId(11);
        book.setName("重构-改善既有代码的设计");
        book.setNumber(100);
        book.setPrice(69);
        book.setPrintshop("人民邮电出版社");

        int i = bookService.updateBook(book);
        Assert.assertFalse(i < 0);
        Assert.assertEquals("返回错误", 1, i);
    }
}