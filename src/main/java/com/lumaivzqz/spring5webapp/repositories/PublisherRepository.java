package com.lumaivzqz.spring5webapp.repositories;

import com.lumaivzqz.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
