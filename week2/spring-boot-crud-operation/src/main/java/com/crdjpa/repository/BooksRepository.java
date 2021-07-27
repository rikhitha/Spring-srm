package com.crdjpa.repository;
import com.crdjpa.model.Books;

import org.springframework.data.repository.CrudRepository;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
