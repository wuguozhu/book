package com.anan.mapper;

import com.anan.BookApplication;
import com.anan.entity.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BookApplication.class)
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;


    /**
     * test get book.
     * @throws Exception
     */
    @Test
    public void getBookById() throws Exception {

        Book book = bookMapper.getBookById(11);
        System.out.println(book.toString());

    }

    /**
     * test save book.
     * @throws Exception
     */
    @Test
    public void saveBook() throws Exception {
        Book book = new Book();
        book.setId(4);
        book.setName("重构-改善既有代码的设计1");
        book.setNumber(101);
        book.setPrice(69);
        book.setPrintshop("人民邮电出版社");

        int i = bookMapper.saveBook(book);
        Assert.assertFalse(i<0);
        Assert.assertEquals("返回错误",1,i);
    }


    /**
     * test delete book.
     * @throws Exception
     */
    @Test
    public void deleteBookById() throws Exception {
        int result = bookMapper.deleteBookById(4);
        assertFalse(result<0);
        assertEquals("正确返回",1,result);
    }


    /**
     * test update book.
     * @throws Exception
     */
    @Test
    public void updateBook() throws Exception {
        Book book = new Book();
        book.setId(3);
        book.setName("重构-改善既有代码的设计");
        book.setNumber(100);
        book.setPrice(69);
        book.setPrintshop("人民邮电出版社");

        int i = bookMapper.updateBook(book);
        Assert.assertFalse(i<0);
        Assert.assertEquals("返回错误",1,i);
    }




}