package com.crdjpa.repository;

import java.util.List;

import com.crdjpa.model.Books;
import com.crdjpa.model.Page;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page, Long>
{

    List<Page> findByBook(Books book, Sort sort);
    
}
