package Hondana.Hondana.Controllers;

import Hondana.Hondana.Model.Book;
import Hondana.Hondana.Service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    @ResponseBody
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable long id) {

        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return book;
    }

    @PutMapping("/book/{id}")
    public Book updatebook(@PathVariable long id, @RequestBody Book book) {
        bookService.updateBook(id, book);
        return book;
    }

    @DeleteMapping("/book/{id}")
    public String deleteBookById(@PathVariable long id) {
        bookService.deleteBookById(id);
        return "Wskazana książka została wykasowana";
    }
}
