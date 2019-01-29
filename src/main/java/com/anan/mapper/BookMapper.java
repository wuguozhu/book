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
     * sava book to database
     * @param book
     * @return
     */
    int saveBook(Book book);

    int deleteBookById(Integer id);

    int updateBook(Book book);
}
