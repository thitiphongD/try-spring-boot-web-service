package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Service {
    @RequestMapping("/books")
    Book[] m2() {
    Book[] data = {
      new Book("Conan", 120.0, 3, 8.0),
      new Book("One punch man", 90.0, 10, 9.8)
        };
    return data;
    }
}

class Book {
    Book(String title, double price, int available, double rating) {
        this.title = title;
        this.price = price;
        this.available = available;
        this.rating = rating;
    }
    public String title;
    public double price;
    int available;
    public double rating;
}