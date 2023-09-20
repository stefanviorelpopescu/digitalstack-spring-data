package org.digitalstack.springdata.dao.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "authors")
@Getter
public class Author {

    @Id
    private Long id;

    private String name;

    private Integer age;

    @Column(unique = true)
    private String phone;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy="author")
    List<Book> books;

}
