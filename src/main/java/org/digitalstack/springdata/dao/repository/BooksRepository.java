package org.digitalstack.springdata.dao.repository;

import org.digitalstack.springdata.dao.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}
