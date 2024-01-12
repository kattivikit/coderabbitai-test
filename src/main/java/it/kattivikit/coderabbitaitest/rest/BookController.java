package it.kattivikit.coderabbitaitest.rest;

import it.kattivikit.coderabbitaitest.models.Book;
import it.kattivikit.coderabbitaitest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value="/books", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Mono<ResponseEntity<List<Book>>> getAllBooks() {
        return bookService.getAllBooks()
                .map(list -> new ResponseEntity<List<Book>>(list, HttpStatus.OK));
    }
}
