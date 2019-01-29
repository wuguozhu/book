package com.anan.mapper;


import com.anan.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    Book getBookById(Integer id);

    int saveBook(Book book);

    void deleteBookById(List<Integer> ids);

    void updateBook(Book book);
}
