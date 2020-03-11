package com.sekolahbackend.tokobukuonline.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
public class BookCategory {

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

    private String code;

    private String name;

//    private Set<Book> books;
//
//    @OneToMany(mappedBy = "bookCategory",cascade = CascadeType.ALL)
//    public Set<Book> getBooks() {
//        return books;
//    }
}
