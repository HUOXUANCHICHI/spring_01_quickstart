package com.ablaze;

import com.ablaze.factory.BookService;
import com.ablaze.factory.impl.BookServiceImpl;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
