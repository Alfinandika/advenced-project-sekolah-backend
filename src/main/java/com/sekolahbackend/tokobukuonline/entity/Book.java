package com.sekolahbackend.tokobukuonline.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

//@Entity
//@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String created_by;

    @CreatedDate
    private LocalDateTime created_time;

    private enum status{
        ACTIVE,
        NOT_ACTIVE
    };

    private String updated_by;

    @LastModifiedDate
    private LocalDateTime updated_time;

    private String author_name;

    private String isbn;

    private Double price;

    private Date publication_date;

    @Lob
    private String synopsis;

    private String title;

//    private BookCategory bookCategory;
//
////    @ManyToOne
////    @JoinColumn(name = "book_category_id")
////    public BookCategory getBookCategory() {
////        return bookCategory;
////    }


}
