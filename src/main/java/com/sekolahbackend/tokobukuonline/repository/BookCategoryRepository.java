package com.sekolahbackend.tokobukuonline.repository;

import com.sekolahbackend.tokobukuonline.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer> {

}
