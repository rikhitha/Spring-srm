package com.javatpoint.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import com.javatpoint.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
    @Query("select b from Books b where b.author=:author")
    public Books getByAuth(String author);
}
