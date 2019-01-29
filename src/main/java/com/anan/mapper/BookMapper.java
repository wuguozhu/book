package com.anan.mapper;


import com.anan.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {


    /**
     * get book by id.
     * @param id
     * @return book
     */
    Book getBookById(Integer id);

    /**
     * save book to database
     * @param book
     * @return executor successful result values.
     */
    int saveBook(Book book);

    /**
     * delete book by id.
     * @param id
     * @return executor successful result values.
     */
    int deleteBookById(Integer id);

    /**
     * update book
     * @param book
     * @return executor successful result values.
     */
    int updateBook(Book book);
}
