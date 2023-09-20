package org.digitalstack.springdata.dao.repository;

import org.digitalstack.springdata.dao.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Long> {
}
