package org.digitalstack.springdata.service;

import org.digitalstack.springdata.dao.model.Author;
import org.digitalstack.springdata.dao.repository.AuthorsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsService {

    private final AuthorsRepository authorsRepository;

    public AuthorsService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public List<Author> getAllAuthors() {
        return authorsRepository.findAll();
    }
}
