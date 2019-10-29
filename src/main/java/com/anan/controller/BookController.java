package com.anan.controller;


import com.anan.entity.Book;
import com.anan.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookServiceImpl bookService;

    /**
     * 添加图书
     * @param book 图书实例
     * @return 成功状态
     */
    @PostMapping(path = "/saveBook")
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book),
                HttpStatus.OK);
    }

    /**\
     * 下架图书
     * @param id 图书id
     * @return 成功状态
     */

    @DeleteMapping(path = "/deleteBookById/{id}")
    public ResponseEntity<?> deleteBookById(@PathVariable String id){
        return new ResponseEntity<>(bookService.deleteBookById(Integer.parseInt(id)),
                HttpStatus.OK);
    }


    /**
     * 根据id更新图书
     * @param book 图书实体
     * @return 成功状态
     */
    @PutMapping(path = "/updateBook")
    public ResponseEntity<?> updateBook( Book book){
        return new ResponseEntity<>(bookService.updateBook(book),
                HttpStatus.OK);
    }

    /**
     * 根据id查询图书
     * @param id 图书id
     * @return 成功状态
     */
    @RequestMapping(path = "/getBookById/{id}")
    public ResponseEntity<?> getBookById(@PathVariable String id) {
        return new ResponseEntity<>(
                bookService.getBookById(Integer.parseInt(id)),
                HttpStatus.OK);
    }
}
