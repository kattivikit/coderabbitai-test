package it.kattivikit.coderabbitaitest.service;

import it.kattivikit.coderabbitaitest.models.Book;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    public Mono<List<Book>> getAllBooks() {
        List<Book> list = Arrays.asList(new Book(201, "Python"), new Book(202, "HTML"));
        return Mono.just(list);
    }
}
