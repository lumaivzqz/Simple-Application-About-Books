package com.lumaivzqz.spring5webapp.repositories;

import com.lumaivzqz.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
