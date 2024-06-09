package Hondana.Hondana.Service;


import Hondana.Hondana.Model.Book;
import Hondana.Hondana.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(long id) {
        return bookRepository.findById(id).get();
    }

    //Dodanie książki
    public void addBook(Book book) {bookRepository.save(book);}

    //Zmiana istniejącej pozycji
    public void updateBook(long id,Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Nie znaleziono pozycji"));
        book.setTitle(bookDetails.getTitle());book.setAuthor(bookDetails.getAuthor());
        book.setNum_of_vol(bookDetails.getNum_of_vol());
        book.setDestination_group(bookDetails.getDestination_group());
        book.setGenre(bookDetails.getGenre());
        bookRepository.save(book);}

    //Usunięcie wszystkich książek
    public void deleteBook(Book book) {bookRepository.delete(book);}

    //Usunięcie istniejącej pozycji po Id
    public void deleteBookById(long book) {bookRepository.deleteById(book);}

}
