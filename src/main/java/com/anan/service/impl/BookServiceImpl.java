package com.anan.service.impl;

import com.anan.entity.Book;
import com.anan.mapper.BookMapper;
import com.anan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * get book by id.
     *
     * @param id for book.
     * @return book
     */
    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    /**
     * add book to database
     *
     * @param book
     * @return check code.
     */
    @Override
    public Integer saveBook(Book book) {
        return bookMapper.saveBook(book);
    }

    /**
     * delete book by id.
     *
     * @param id for book
     * @return check code.
     */
    @Override
    public Integer deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    /**
     * update book by id.
     *
     * @param book
     * @return execute check code.
     */
    @Override
    public Integer updateBook(Book book) {
        return bookMapper.updateBook(book);
    }


}
