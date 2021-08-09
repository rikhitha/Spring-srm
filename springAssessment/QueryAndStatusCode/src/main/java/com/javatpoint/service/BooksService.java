package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

@Service
public class BooksService 
{
public BooksRepository booksRepository;

public List<Books> getAllBooks() 
{
List<Books> books = new ArrayList<Books>();
booksRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}

public Books getBooksById(int id) 
{
return booksRepository.findById(id).get();
}

public void saveOrUpdate(Books books) 
{
booksRepository.save(books);
}

public void delete(int id) 
{
booksRepository.deleteById(id);
}

public void update(Books books, int bookid) 
{
booksRepository.save(books);
}

public Books getByAuthor(String author)
{
    Books b= booksRepository.getByAuth(author);
    return b;
    
}
}