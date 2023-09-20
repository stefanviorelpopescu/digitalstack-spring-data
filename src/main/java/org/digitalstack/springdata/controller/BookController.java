package org.digitalstack.springdata.controller;

import org.digitalstack.springdata.dao.model.Book;
import org.digitalstack.springdata.service.BooksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BooksService booksService;

    public BookController(BooksService booksService) {
        this.booksService = booksService;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return booksService.getAllBooks();
    }
}
