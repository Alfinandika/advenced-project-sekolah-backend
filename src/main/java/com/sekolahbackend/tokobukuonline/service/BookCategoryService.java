package com.sekolahbackend.tokobukuonline.service;

import com.sekolahbackend.tokobukuonline.entity.BookCategory;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookCategoryService {

    Iterable<BookCategory> findAll();

    BookCategory findById(Integer id);

    BookCategory update(Integer id, BookCategory bookCategory);

    BookCategory create(BookCategory bookCategory);

    void delete(Integer id);

}
