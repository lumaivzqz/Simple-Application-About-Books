package com.lumaivzqz.spring5webapp.repositories;

import com.lumaivzqz.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
