package org.digitalstack.springdata.dao.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "books")
@Getter
public class Book {

    @Id
    private Long id;

    private String bookName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    Author author;

}
