package com.anan.mapper;


import com.anan.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {

    Book getBookById(int id);
}
