package hu.tmx.spring.spring.controller;

import hu.tmx.spring.spring.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){

        return List.of(
                new Book(1, "Mastering Spring", "FReni")
        );
    }

}
