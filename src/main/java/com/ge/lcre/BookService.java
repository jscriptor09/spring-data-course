package com.ge.lcre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mark on 10/2/2016.
 */
@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public void save(Book book) {
        this.repo.save(book);
    }

}
