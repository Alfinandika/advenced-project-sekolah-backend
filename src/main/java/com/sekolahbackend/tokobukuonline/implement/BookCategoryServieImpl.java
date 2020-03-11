package com.sekolahbackend.tokobukuonline.implement;

import com.sekolahbackend.tokobukuonline.entity.BookCategory;
import com.sekolahbackend.tokobukuonline.repository.BookCategoryRepository;
import com.sekolahbackend.tokobukuonline.service.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookCategoryServieImpl implements BookCategoryService {

    @Autowired
    BookCategoryRepository bookCategoryRepository;

    @Override
    public Iterable<BookCategory> findAll() {
        return bookCategoryRepository.findAll();
    }

    @Override
    public BookCategory findById(Integer id) {
        return bookCategoryRepository.getOne(id);
    }

    @Override
    public BookCategory update(Integer id, BookCategory bookCategory) {
        bookCategory.setId(id);
        return bookCategoryRepository.save(bookCategory);
    }

    @Override
    public BookCategory create(BookCategory bookCategory) {
        return bookCategoryRepository.save(bookCategory);
    }

    @Override
    public void delete(Integer id) {
        bookCategoryRepository.deleteById(id);
    }
}
