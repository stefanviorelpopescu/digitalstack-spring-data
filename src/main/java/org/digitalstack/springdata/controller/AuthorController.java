package org.digitalstack.springdata.controller;

import jdk.jfr.ContentType;
import org.digitalstack.springdata.dao.model.Author;
import org.digitalstack.springdata.service.AuthorsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorsService authorsService;

    public AuthorController(AuthorsService authorsService) {
        this.authorsService = authorsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> allAuthors = authorsService.getAllAuthors();
        return new ResponseEntity<>(allAuthors, HttpStatus.OK);
    }
}
