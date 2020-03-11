package com.sekolahbackend.tokobukuonline.controller;

import com.sekolahbackend.tokobukuonline.entity.BookCategory;
import com.sekolahbackend.tokobukuonline.implement.BookCategoryServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bookcategory")
public class BookCategoryController {

    @Autowired
    private BookCategoryServieImpl bookCategoryServie;

    @GetMapping
    public Iterable<BookCategory> getBookCategory(){
        return bookCategoryServie.findAll();
    }

    @PostMapping
    public ResponseEntity<BookCategory> saveBookCategory(@RequestBody BookCategory bookCategory){
        BookCategory bookCategory1 = bookCategoryServie.create(bookCategory);


        return new ResponseEntity<>(bookCategory1, HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateBookCategory(@RequestBody BookCategory bookCategory, @PathVariable Integer id){
        bookCategoryServie.update(id, bookCategory);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable("id") Integer id){
        bookCategoryServie.delete(id);
    }
}

